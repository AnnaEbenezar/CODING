# Define the Joint Probabilities as a matrix
Joint = matrix(c(0.01,0.02,0.25,0.02,0.03,0.20,0.02,0.10,
                 0.05,0.15,0.10,0.05),nrow=4,ncol=3, byrow=TRUE)

# Define the function(x, matrix/data) to compute conditional mean and variance
my.ConditionalMeanAndVar = function(x, data)  {
  
  # Subset the data to only include rows where X == x
  x_data <- subset(data, X == x)
  
  # Mean(Y|X=x) = Summation of (Y * (Prob(Y|X=x) / Summation(Prob(Y|X=x))))
  # Eg. (1 * 0.01/0.2 + 2 * 0.02/0.2 + 3 * 0.02/0.2 + 4 * 0.15/0.2)
  y_mean <- sum(x_data$Y * (x_data$Prob / sum(x_data$Prob)))
  
  # Variance(Y|X=x) = Summation of ((Y - y_mean)^2 * (Prob(Y|X=x) / Summation(Prob(Y|X=x)))) 
  # Eg. ((1 - 3.55)^2 * (0.01/0.2) + (2 - 3.55)^2 * (0.02/0.2) + 
  #      (3 - 3.55)^2 * (0.02/0.2) + (4 - 3.55)^2 * (0.15/0.2))
  y_var <- sum((x_data$Y - y_mean)^2 * (x_data$Prob / sum(x_data$Prob)))
  
  # Variance(Y|X=x) = Summation of (Y^2 * (Prob(Y|X=x) / Summation(Prob(Y|X=x)))) - y_mean^2 
  # Eg. (1^2 * 0.01/0.2 + 2^2 * 0.02/0.2 + 3^2 * 0.02/0.2 + 4^2 * 0.15/0.2) - 3.55^2
  #y_var <- sum((x_data$Y)^2 * (x_data$Prob / sum(x_data$Prob))) - y_mean^2
  
  # Return the results as a named vector
  return(c(mean = y_mean, variance = y_var))
}

# Printing the matrix of Joint Probabilities
dim(Joint) <- c(4,3)
Joint

# Create a data frame from the joint probabilities
# 3 columns - 'X' 'Y' 'Prob'
# X column repeats 1, 2, 3, each 4 times (12 rows) - (111122223...)
# Y column repeats (1, 2, 3, 4)  3 times (12 rows) - (123412341...)
# Prob column converts the 'Joint' matrix into a vector using the 'as.vector()'
data <- data.frame(X = rep(1:3, each = 4), Y = rep(1:4, times=3), Prob = as.vector(Joint))
print.data.frame(data)

# Printing Values
for(x in 1:3) {
  cat("Mean & Variance of Y if X is equal to:", x, "\n")
  print(my.ConditionalMeanAndVar(x, data))
}
