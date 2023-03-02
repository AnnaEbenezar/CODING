# create the function to approximate pi
my.pi = function(n){
  
  #set the seed
  set.seed(393)
  
  #uniform randomization of (n) points between 0 and 1
  x <- runif(n, min=0, max=1)
  y <- runif(n, min=0, max=1)
  
  #distance from origin (radius)
  #formula for a circle
  dist <- sqrt((x^2)+(y^2))
  
  #calculate the number of dots within the circle
  num.circle.dots = sum(dist <= 1)
  
  #ratio of all the dots inside the circle / all the dots
  ratio = num.circle.dots / n
  
  # pi = ratio * 4 (this is a quarter of the full graph)
  estimate_pi = 4 * ratio
  
  #calculate the difference between the estimate and pi
  diff = abs(estimate_pi - 3.14159)
  
  options(scipen=30)
  
  #Print the Results
  cat("Number of dots =", n, "\n")
  cat("Estimated pi =", estimate_pi, "\n")
  cat("Difference from 3.14159 =", diff, "\n\n")
  
  #Plot the Dots
  plot(x,y,col=ifelse(dist<=1,"red","blue"), asp=1, pch=11)
}

#Call Function
# n = 500,000
my.pi(500000)
# n = 1,000,000
my.pi(1000000)
# n = 2,000,000
my.pi(2000000)
