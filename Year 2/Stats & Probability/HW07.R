# set the seed
set.seed(393)

# generates a random sample of 500 values from a Weibull distribution 
# with a shape parameter of 4 and a scale parameter of 3, stored in wb
wb <- rweibull(n = 500, shape = 4, scale = 3)

# creates a data frame from the "wb" variable and then writes it to a 
# CSV file, which will have a single column of 500 values  
write.csv(data.frame(wb), file = "HW07_wbData.csv")