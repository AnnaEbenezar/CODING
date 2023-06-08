x = runif(1000,min=0,max=1)
y = runif(1000)
r = sqrt((x^2)+(y^2))

num.circle.dots = sum(r<=1)
num.square.dots = 1000

ratio = num.circle.dots/num.square.dots

my.pi = 4*ratio
my.pi

plot(x,y,col=ifelse(r<=1,"red","blue"), asp=1, pch=20)