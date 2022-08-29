## Lab 03
## 1.1
##
##import math
##
##print(math.pi)


## 1.2

##import math
##
##pi = math.pi
##print(format(pi, ".4f"))


## 1.3

##import math
##
##pi = math.pi
##print(format(pi, "10.2e"))


## 2

##get_ch = input("Input a character: ")
##print(hex(ord(get_ch)))


## 3

##s1 = input("Enter the first string: ")
##s2 = input("Enter the second string: ")
##s3 = input("Enter the third string: ")
##s4 = s1 + s2 + s3
##print("The whole string is " + s4.upper())




## 4

##import turtle
##t = turtle.Turtle()
##
##width = int(input("Input desired width of Flag: "))
##length = (width * 3) / 2 
##lengthB = (length / 3)
##lengthRW = (lengthB / 2)
##
##t.color("red")
##t.fillcolor("red")
##t.begin_fill()
##for i in range(2):
##    t.fd(width)
##    t.right(90)
##    t.fd(lengthRW)
##    t.right(90)
##t.end_fill()
##
##t.penup()
##t.goto(0, lengthRW)
##t.pendown()
##
##t.color("white")
##t.fillcolor("white")
##t.begin_fill()
##for i in range(2):
##    t.fd(width)
##    t.right(90)
##    t.fd(lengthRW)
##    t.right(90)
##t.end_fill()
##
##t.penup()
##t.goto(0, (lengthB + lengthRW))
##t.pendown()
##
##t.color("blue")
##t.fillcolor("blue")
##t.begin_fill()
##for i in range(2):
##    t.fd(width)
##    t.right(90)
##    t.fd(lengthB)
##    t.right(90)
##t.end_fill()
##
##t.penup()
##t.goto(0, (lengthB + (lengthRW * 2)))
##t.pendown()
##
##t.color("white")
##t.fillcolor("white")
##t.begin_fill()
##for i in range(2):
##    t.fd(width)
##    t.right(90)
##    t.fd(lengthRW)
##    t.right(90)
##t.end_fill()
##
##t.penup()
##t.goto(0, (lengthRW + (lengthB * 2)))
##t.pendown()
##
##t.color("red")
##t.fillcolor("red")
##t.begin_fill()
##for i in range(2):
##    t.fd(width)
##    t.right(90)
##    t.fd(lengthRW)
##    t.right(90)
##t.end_fill()
##
##turtle.done()
