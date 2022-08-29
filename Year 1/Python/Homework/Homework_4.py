## Number 1

##import turtle
##t = turtle.Turtle()
##
##def move (x, y):
##    t.penup()
##    t.goto(x, y)
##    t.pendown()
##
##x0 = float(input("Enter the X-Coordinate of the Point P0: "))
##y0 = float(input("Enter the y-Coordinate of the Point P0: "))
##x1 = float(input("Enter the X-Coordinate of the Point P1: "))
##y1 = float(input("Enter the y-Coordinate of the Point P1: "))
##x2 = float(input("Enter the X-Coordinate of the Point P2: "))
##y2 = float(input("Enter the Y-Coordinate of the Point P2: "))
##
##move (x0, y0)
##t.setpos (x1, y1)
##
#### Cuz its the formula given in the book
##formula = ((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0))
##
##if formula > 0:
##    print ("Point P2 is located on the left side of the line.")
##elif formula == 0:
##    print ("Point P2 is located on the same line.")
##elif formula < 0:
##    print ("Point P2 is located on the right side of the line.")
##
##t.done()                                     


## Number 2

##import turtle
##t = turtle.Turtle()
##
##def rectangle (x, y): ## (width, height)
##    for i in range (2):
##        t.fd(x) ##width
##        t.right(90)
##        t.fd(y) ##height
##        t.right(90)
##
##def upperLeft (x, y, w, h): ## XCor, YCor, Width, Height
##    xULC = x - (w / 2) ## ULC = Upper Left Corner
##    yULC = y + (h / 2)
##    t.penup()
##    t.goto(xULC, yULC)
##    t.pendown()
##
#### Rectangle 1 Input
##x1 = float(input("Enter the X-Coordinate for the Centre of Rectangle 1: "))
##y1 = float(input("Enter the y-Coordinate for the Centre of Rectangle 1: "))
##h1 = float(input("Enter the Height of Rectangle 1: "))
##w1 = float(input("Enter the Width of Rectangle 1: "))
##
#### Rectangle 2 Input
##x2 = float(input("Enter the X-Coordinate for the Centre of Rectangle 2: "))
##y2 = float(input("Enter the y-Coordinate for the Centre of Rectangle 2: "))
##h2 = float(input("Enter the Height of Rectangle 2: "))
##w2 = float(input("Enter the Width of Rectangle 2: "))
##
#### Rectangle 1 on Turtle
##upperLeft (x1, y1, w1, h1)
##rectangle (w1, h1)
#### Rectangle 2 on Turtle
##upperLeft (x2, y2, w2, h2)
##rectangle (w2, h2)
##
#### Distance between Centres
##xDist = x1 - x2 if x1 - x2 >= 0 else x2 - x1 ## Difference between x1 and x2
##yDist = y1 - y2 if y1 - y2 >= 0 else y2 - y1 ## Difference between y1 and y2
##
#### Distance of centres needs to be less than difference of width and height divided by 2
##if xDist <= (w1 - w2) / 2 and yDist <= (h1 - h2) / 2: 
##    print("Rectangle 2 is inside Rectangle 1")
##elif xDist <= (w2 - w1) / 2 and yDist <= (h2 - h1) / 2:
##    print("Rectangle 1 is inside Rectangle 2")
#### Distance of centres needs to be less than combined widths and heights divided by 2
##elif xDist <= (w1 + w2) / 2 and yDist <= (h1 + h2) / 2:
##    print("Rectangle 2 overlaps Rectangle 1")
##else:
##    print("Rectangle 2 doesn't overlap Rectangle 1")
##
##t.done()





