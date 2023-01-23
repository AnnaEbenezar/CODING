# create function
coinFlip = function(n){
  
  # set the seed
  set.seed(0)
  
  # vector of the sample space
  # a coin can only have either Heads or Tails
  coin <- c("HEADS", "TAILS")
  
  #find the sample space 
  # determine how many times the coin should be flipped (n)
  ss <- sample(coin, n, replace = TRUE)
  
  # find the probability of landing on HEADS
  # P(E)=frequency of "HEADS"/number of trials(flips).
  prob.heads <- sum(ss == "HEADS")/n
  
  # find the difference of HEADS from 0.5
  diff <- abs(prob.heads - 0.5)
  
  # print the results
  cat("Finding the empirical probability of HEADS from ", n, "flips\n")
  cat("Probability of getting HEADS: = ", prob.heads, "\n")
  cat("The difference from 0.5 is = ", diff, "\n")
}

# call function
coinFlip(1000)
coinFlip(100000)
coinFlip(1000000)