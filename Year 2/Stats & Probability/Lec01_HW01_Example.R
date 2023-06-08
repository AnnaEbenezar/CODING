# create function
get3 = function(n){
  
  # setting seed
  set.seed(0)
  
  # vector of the sample space
  die <- c(1,2,3,4,5,6)
  
  # find sample space
  ss <- sample(die,n,replace = TRUE)
  
  # find probability of 3
  prob.three <- sum(ss==3)/n
  
  # print probability of 3
  cat("Probability of getting 3 = ", prob.three,"\n")
  
  # find different of 3
  diff <- abs(prob.three - 1/6)
  
  # print different of 3
  cat("Different from 1/6 ", diff, "\n")
}

# call function
get3(100)
get3(10000)
get3(1000000)