# create function(mean, standard deviation)
my.EmpiricalNormalDist = function(mean, SD){
  
  # set the seed
  set.seed(393)
  
  # sample size
  n <- 10000000
  
  # creates sample of n values from a normal distribution 
  # with the specified mean and standard deviation
  X <- rnorm(n, mean, SD)
  
  for (x in 1:3) {
    # Find area within the respective standard deviation
    
    # Minimum = mean - (x * SD); calcs the min value of the range
    sd_min = mean - (x*SD)
    # Maximum = mean + (x * SD); calcs the max value of the range
    sd_max = mean + (x*SD)
    
    # the area within the SD is equal to the summation of all  
    # the values between sd_min and sd_max divided by n
    area = sum(sd_min <= X & X < sd_max) / n 
    
    # Printing Values
    cat('Area within', x, 'standard deviation(s) =', area, '\n')
    cat(area * 100, '% of the data is within', x, 'standard deviation(s)', 
        SD, 'of the mean', mean, '\n')
  }
}

#Call Function
my.EmpiricalNormalDist(3.9, 1.75)