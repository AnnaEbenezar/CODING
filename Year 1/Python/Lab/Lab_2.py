## Compute Expression (1)

##w = 2
##x = 3
##y = 4
##z = 5
##
##print((x * x * x) + (y * (z / 2)) - w)


## Compute Area and Volume of a Cylinder (2)

##rad = int(input("Value of the Cylinder's Radius: "))
##length = int(input("Value of the Cylinder's Length: "))
##pi = 3.14159
##
##area = pi * rad * rad
##volume = area * length
##
##print("The area for the circle is", area, "and the volume is", volume)


## Draw a Hexagon with turtle :) (3)

##import turtle
##t = turtle.Turtle()
##for i in range(6):
##    t.fd(100)
##    t.right(60)
##turtle.done()


## Draw a circle (4)

##import turtle
##t = turtle.Turtle()
##
##xcor = int(input("X-Coordinate: "))
##ycor = int(input("Y-Coordinate: "))
##rad = int(input("Circle's Radius: "))
##area = (3.14159 * rad * rad)
##
##t.penup()
##t.goto(xcor, ycor)
##t.pendown()
##t.circle(rad)
##t.left(90)
##t.penup()
##t.fd(rad)
##t.pendown()
##t.write(area)
##turtle.done()


