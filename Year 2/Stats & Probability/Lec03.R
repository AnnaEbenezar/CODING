set.seed(393)

#Random Binomial Distribution
rbinom(30, 20, 0.5)

#Density Binomial Distribution
dbinom(4, 20, 0.5)

options(scipen = 30)
dbinom(c(0, 1, 2, 3, 4), 20, 0.5)

# Cumulative Probability
pbinom(4, 20, 0.4)