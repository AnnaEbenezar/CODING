# set the seed
set.seed(393)

# generates a random sample of 1000 values from a normal distribution 
# with a mean of 15 and a standard deviation of 3, stored in x
x <- rnorm(n=1000, mean=15, sd=3)

# creates a histogram of the 'x' data
hist(x)

# creates a boxplot of the 'x' data
boxplot(x)

# creates a normal probability plot of the 'x' data
qqnorm(x)

# adds a red reference line to the previous plot,
# aids in assessing the normality of the 'x' data
qqline(x, col='red', lwd=2)


# set the seed
set.seed(393)

# generates a random sample of 1000 values from a chi-squared  
# distribution with 4 degrees of freedom, stored in y
y <- rchisq(n=1000, df=4)

# creates a histogram of the 'y' data
hist(y)

# creates a boxplot of the 'y' data
boxplot(y) 

# creates a normal probability plot of the 'y' data
qqnorm(y) 

# adds a blue reference line to the previous plot,
# aids in assessing the normality of the 'y' data
qqline(y,col='blue',lwd=2)