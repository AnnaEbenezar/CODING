# create function(x)
my.Binomial = function(n){
  
  # X is the number of bits received in error / (discrete random value)
  # Vector for the X values
  num_bits <- seq(0, n)
  
  # Vector for the associated probabilities
  probability <- dbinom(num_bits, n, 0.1)
  
  # ggplot because the book told me to do it -.-
  # its in a print function because stackoverflow told me to do it
  print(
    plt2 <- ggplot(NULL, aes(x=num_bits, y=probability)) +
      geom_bar(stat="identity", width = 1, color = "pink")
  ) 
  
  # Mean or expected value E(X) is (summation(x * f(x)))
  Mean = sum(num_bits * probability)
  
  # Variance of X V(X) is (((x - Mean) ^ 2) * f(x))
  vari = sum(((num_bits - Mean)^2) * probability)
  
  # Standard Deviation of X is (square root of variance)
  SD = sqrt(vari)
  
  #Printing Values
  options(scipen=30)
  
  cat("Probability of all the X values are: \n")
  
  for (x in num_bits){
    cat(x, " = ", dbinom(x, n, 0.1), "\n")
  }
  
  cat("Mean = ", Mean, "\n")
  cat("Variance = ", vari, "\n")
  cat("Standard Deviation = ", SD, "\n")
}

# Call Function
my.Binomial(4)