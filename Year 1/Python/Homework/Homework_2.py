## Number 1

###take inputs
##num1 = int(input("Enter first number: "))
##num2 = int(input("Enter second number: "))
##num3 = int(input("Enter third number: "))
##num4 = int(input("Enter fourth number: "))
##num5 = int(input("Enter fifth number: "))
##
###calculate the summation and average
##summ = num1 + num2 + num3 + num4 + num5
##avg = summ / 5
##
##print ("The summation of the numbers is: ", summ)
##print ("The average of the numbers is: ", avg)



## Draw a house
## https://www.desmos.com/calculator/ydj9obmnku?lang=th

##import turtle
##import math
##
##t = turtle.Turtle()
##
##def box (x):
##    for i in range (4):
##        t.fd(x)
##        t.left(90)
##
##def rectangle (x, y):
##    for i in range (2):
##        t.fd(x) ##width
##        t.left(90)
##        t.fd(y) ##length
##        t.left(90)
##
##def triangle (a, b, c, d):
##    t.fd(a)
##    t.left(b)
##    t.fd(c)
##    t.left(d)
##    t.fd(c)
##    t.left(b)
##
##def move (x, y):
##    t.penup()
##    t.goto(x, y)
##    t.pendown()
##
##move (60, 0) ##base
####t.fillcolor("red")
####t.begin_fill()
##rectangle (360, 160)
####t.end_fill()
##
##move (120, 0) ##Back Building 1 (left)
##t.fillcolor("#d6b963")
##t.begin_fill()
##rectangle (100, 160)
##t.end_fill()
##
##move (100, 160) ##Trapezoid 1
##t.fillcolor("#c83737")
##t.begin_fill()
##t.fd(140)
##t.left(108.435)
##t.fd(126.49)
##t.left(71.565)
##t.fd(60)
##t.left(71.565)
##t.fd(126.49)
##t.left(108.435)
##t.end_fill()
##
##move (350, 0) ##Back Building 2 (right)
##t.fillcolor("#d6b963")
##t.begin_fill()
##rectangle (70, 240)
##t.end_fill()
##
##move (60, 0) ##Front building 1 (left)
##t.fillcolor("#edd077")
##t.begin_fill()
##rectangle (100, 160)
##t.end_fill()
##
##move (47.14, 160) ##Triangle 1
##t.fillcolor("brown")
##t.begin_fill()
##triangle (125.72, 128.16, 101.74, 103.68)
##t.end_fill()
##
##move (220, 0) ##Front Building 2 (right)
##t.fillcolor("#edd077")
##t.begin_fill()
##rectangle (140, 220)
##t.end_fill()
##
##move (207.14, 220) ##Triangle 2
##t.fillcolor("brown")
##t.begin_fill()
##triangle (165.72, 136.006, 115.177, 87.986)
##t.end_fill()
##
##move (160, 120) ## Trapezoid 2
##t.fillcolor("blue")
##t.begin_fill()
##t.fd(260)
##t.right(45)
##t.fd(30)
##t.right(135)
##t.fd(280)
##t.right(90)
##t.fd(18.95)
##t.end_fill()
##
##move (160, 0) ##Door
##t.fillcolor("yellow")
##t.begin_fill()
##t.fd(100)
##t.right(56.31)
##t.fd(36.06)
##t.right(67.38)
##t.fd(36.06)
##t.right(56.31)
##t.fd(100)
##t.right(90)
##t.fd(60)
##t.end_fill()
##
##t.fillcolor("white")
##t.begin_fill()
##move (200, 80)
##rectangle (20, 80)
##t.end_fill()
##
##move (140, 140) ##Window 1 Front Building (left)
##t.fillcolor("white")
##t.begin_fill()
##rectangle (30, 20)
##move (110, 140)
##rectangle (30, 20)
##move (140, 120)
##rectangle (30, 20)
##move (110, 120)
##rectangle (30, 20)
##t.end_fill()
##
##move (140, 60) ##Window 2 Front Building (left)
##t.fillcolor("white")
##t.begin_fill()
##rectangle (30, 20)
##move (110, 60)
##rectangle (30, 20)
##move (140, 40)
##rectangle (30, 20)
##move (110, 40)
##rectangle (30, 20)
##t.end_fill()
##
##move (320, 200) ##Window 1 front building (right)
##t.fillcolor("white")
##t.begin_fill()
##box (30)
##move (290, 200)
##box (30)
##move (320, 170)
##box (30)
##move (290, 170)
##box (30)
##t.end_fill()
##
##move (170, 260)
##t.fillcolor("white")
##t.begin_fill()
##t.left(45)
##box(30)
##t.end_fill()
##
##move (390, 220)
##t.fillcolor("white")
##t.begin_fill()
##box(20)
##t.end_fill()
##
##move (390, 160)
##t.fillcolor("white")
##t.begin_fill()
##box(20)
##t.end_fill()
##
##move (390, 90)
##t.fillcolor("white")
##t.begin_fill()
##box(20)
##t.end_fill()
##
##t.color("white") ##Fence
##t.right(45)
##move (360, 40)
##rectangle (10, 40)
##move (350, 40)
##rectangle (10, 40)
##move (340, 40)
##rectangle (10, 40)
##move (330, 40)
##rectangle (10, 40)
##move (320, 40)
##rectangle (10, 40)
##move (310, 40)
##rectangle (10, 40)
##move (300, 40)
##rectangle (10, 40)
##move (290, 40)
##rectangle (10, 40)
##move (280, 40)
##rectangle (10, 40)
##move (270, 40)
##rectangle (10, 40)
##move (260, 40)
##rectangle (10, 40)
##move (250, 40)
##rectangle (10, 40)
##move (240, 40)
##rectangle (10, 40)
##move (230, 40)
##rectangle (10, 40)
##
##move (-175, 200)
##t.fillcolor("yellow")
##t.begin_fill()
##for i in range(12):
##    t.right(-150)
##    t.fd(200)
##t.end_fill()
##
##turtle.done()










