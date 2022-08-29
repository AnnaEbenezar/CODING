## Midterm

## Number 2

##first_currency = str(input("Please Enter the First Currency: "))
##exchange_amount = float(input("What amount of " + first_currency +
##                              " do you want to exchange? "))
##currency = str(input("What currency do you want to convert to? "))
##exchange_rate = float(input("Please tell me the exchange rate, 1 " +
##                            first_currency + " is how much in "
##                            + currency + "? "))
##new_amount = exchange_amount * exchange_rate
##amt_format = str(format(new_amount, ".2f"))
##print("So your " + str(exchange_amount) + " " + first_currency +
##      " will be exchanged to " + amt_format + " " + currency + ".") 


## Number 3

##x = []
##y = 0
##for i in range(2):    
##    for j in range(5):        
##        x = x + [y]
##        y += 3
##    y += 3
##x = x + [y]
##
##print(x)


## Number 4

## Number 5

##import turtle
##import random
##t = turtle.Turtle()
##
##def draw_hex (n):
##    t.penup()
##    t.fd(n)
##    t.right(60)
##    t.pendown()
##    for i in range(6):
##        t.right(60)
##        t.fd(n)
##    t.penup()
##    t.left(60)
##    t.bk(n)
##    t.pendown()
##
##def spiral_hex(n):
##    draw_hex(n)
##    if n >= 10:         
##        while n >= 10:
##            n = n * 0.75
##            t.left(30)
##            draw_hex(n)
##
##
##spiral_hex(80)

####def spiral_hex2(hexSideLen, angle):
####    color = ['black', 'red', 'blue', 'yellow', 'green', 'cyan', 'magenta']
####    loop_num = int(360/(6 * angle))
####    for i in range(loop_num):
####        t.color(color[random.randint(0,6)])
####        draw_hex(hexSideLen)
####        t.right(angle)
####    
####t.speed(0)
####spiral_hex2(200, 5)
