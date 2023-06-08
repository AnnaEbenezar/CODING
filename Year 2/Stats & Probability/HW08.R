# Central Limit Theorem (CLT) Proof

# initialize var to store sample means
x.bar = 0

# set the seed
set.seed(393)

# generates a random sample of 700 values from a chi-squared  
# distribution with 4 degrees of freedom, stored in popu.x
# population from which samples will be drawn
popu.x <- rchisq(n = 700, df = 4)

# loop over different sample sizes
for (j in 1:4) {
  
  # set sample size to 80 * loop index
  samp.size = 80 * j
  
  # loop over each sample size and calculate sample means
  for(i in 1:3000)  {
    
    # each iteration, it takes a random sample of size samp.size 
    # with replacement from the population
    samp.x = sample(popu.x, size = samp.size, replace = TRUE)
    
    # stores the calculated mean at the current interation 'i'
    x.bar[i] = mean(samp.x)
  }
  
  # Population Distribution
  hist(popu.x)
  
  # Sampling Distribution
  hist(x.bar)
  
  # Rule1 Proof
  # mean of the sampling distribution 
  # should be equal to the mean of the population.
  xb.mean = mean(x.bar)
  pop.mean = mean(popu.x)
  
  # calculate mean difference between sampling distribution 
  # and population distribution
  mean.diff = abs(xb.mean - pop.mean)
  
  # Rule2 Proof
  # standard deviation of the sampling distribution 
  # should be equal to the standard deviation of the population 
  # divided by the square root of the sample size
  xb.sd = sd(x.bar)
  pop.sd = sd(popu.x)/sqrt(samp.size)
  
  # calculate standard deviation difference between sampling distribution 
  # and population distribution, scaled by the square root of the sample size
  sd.diff = abs(xb.sd - pop.sd)
  
  # print mean and standard deviation differences for each sample size
  cat('Mean of Sample', j, '=', xb.mean, '\n')
  cat('Mean of Population', j, '=', pop.mean, '\n')
  cat('Mean Difference', j, '=', mean.diff, '\n\n')
  
  cat('SD of Sample', j, '=', xb.sd, '\n')
  cat('SD of Population', j, '=', pop.sd, '\n')
  cat('SD Difference', j, '=', sd.diff, '\n\n\n')
  }
