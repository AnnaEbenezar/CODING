## Number 1

##n = float(input("Enter a number: "))
##
##def sqrt(n, x):
##    lastguess = n
##    nextguess = (lastguess + (n / lastguess)) / 2
##    count = 0
##    while count < x:
##        lastguess = nextguess
##        nextguess = (lastguess + (n / lastguess)) / 2
##        count = count + 1
##    return nextguess
##
##nextguess = sqrt(n, 5)
##print("5th time: " + str(nextguess))
##nextguess = sqrt(n, 6)
##print("6th time: " + str(nextguess))
##nextguess = sqrt(n, 7)
##print("7th time: " + str(nextguess))


## Number 2

##import calendar
##import turtle
##
##t = turtle.Turtle()
##c = calendar.Calendar()
##
##def move(x, y):
##    t.penup()
##    t.goto(x, y)
##    t.pendown()
##
##def cal(year, month):
##    return calendar.month(year, month)
##
##def calcal():
##    xAxis = -150
##    yAxis = 80
##    cYear = 2021
##    month = 1
##    ##calen = cal(2021, month)
##    while month < 13:
##        for a in range (4):
##            for b in range (3):
##                calen = cal(2021, month)
##                move(xAxis, yAxis)
##                t.write(calen)
##                month = month + 1
##                xAxis = xAxis +150
##            yAxis = yAxis - 120
##            xAxis = xAxis - 450
##
##calcal()            


## Number 3

##def pyramid(n):    
##    for i in range (0, n):
##        for j in range (0, i+1):
##            print("*", end="")
##        print("\r")
##
##    m = n
##    for i in range (0, m):
##        for j in range (1, m):
##            print("*", end="")
##        print("\r")
##        m -= 1
##
##
##x = int(input("Input any integer: "))
##
##for i in range (x):
##    pyramid(x)
##    x = x - 1
