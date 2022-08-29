## Number 1

##print("Employee Payroll Statement")
##
##employee_name = input("Enter Employee's Name: ")
##hours_per_week = float(input("Enter number of hours worked in a week: "))
##moolah_per_hour = float(input("Enter hourly pay rate: $"))
##federal_tax = float(input("Enter federal tax withholding rate: "))
##state_tax = float(input("Enter state tax withholding rate: "))
##
##gross_pay = moolah_per_hour * hours_per_week
##federal_withholding = gross_pay * federal_tax
##state_withholding = gross_pay * state_tax
##total_deductions = state_withholding + federal_withholding
##net_pay = gross_pay - total_deductions
##
##print("Employee Name: " + employee_name)
##print("Hours Worked: " + str(hours_per_week))
##print("Pay Rate: $ " + str(moolah_per_hour))
##print("Gross Pay: $ " + str(format(gross_pay, ".2f")))
##print("Deductions:")
##print("Federal Withholding: $" + str(format(federal_withholding, ".2f")))
##print("State Withholding: $" + str(format(state_withholding, ".2f")))
##print("Total Deductions: $" + str(format(total_deductions, ".2f")))
##print("Net Pay: $" + str(format(net_pay, ".2f")))


## Number 2

##theNums = input("Input a 4-digit integer: ")
##str(theNums)
##print("Reversed List:", theNums[::-1])


## Number 3

##import turtle
##t = turtle.Turtle()
##
##length = int(input("Input desired length of Star: "))
##
##for i in range (5):
##    t.fd(length)
##    t.right(144)


## Number 4

##import turtle
##
##circ_rad = int(input("Input the desired radius for the Olympic Rings: "))
##
##def move (x, y):
##    turtle.penup()
##    turtle.goto(x, y)
##    turtle.pendown()
##
##xCor = (circ_rad * 2) + 20
##xCorTwo = xCor / 2
##yCor = circ_rad
##
##turtle.color("blue")
##move ((xCor * -1), 0)
##turtle.circle(circ_rad)
##
##turtle.color("black")
##move (0, 0)
##turtle.circle(circ_rad)
##
##turtle.color("red")
##move ((xCor), 0)
##turtle.circle(circ_rad)
##
##turtle.color("yellow")
##move ((xCorTwo * -1), (yCor * -1))
##turtle.circle(circ_rad)
##
##turtle.color("green")
##move ((xCorTwo), (yCor * -1))
##turtle.circle(circ_rad)
##
##turtle.done()


## Number 5

##import turtle
##import math
##
##t = turtle.Turtle()
##
##x1 = float(input("Enter the X-Coordinate of the First Point: "))
##y1 = float(input("Enter the y-Coordinate of the First Point: "))
##x2 = float(input("Enter the X-Coordinate of the Second Point: "))
##y2 = float(input("Enter the y-Coordinate of the Second Point: "))
##x3 = float(input("Enter the X-Coordinate of the Third Point: "))
##y3 = float(input("Enter the Y-Coordinate of the Third Point: "))
##
##def distance (x,y,xt,yt):
##    distance = math.sqrt((x-xt)**2 + (y-yt)**2)
##    return distance
##
##def move (x, y):
##    t.penup()
##    t.goto(x, y)
##    t.pendown()
##
##side1 = distance (x2, y2, x1, y1)
##side2 = distance (x3, y3, x2, y2)
##side3 = distance (x1, y1, x3, y3)
##
##s = (side1 + side2 + side3) / 2
##area = math.sqrt(s * (s - side1) * (s - side2) * (s - side3))
##
##move (x1, y1)
##
##t.setpos(x2, y2)
##t.setpos(x3, y3)
##t.setpos(x1, y1)
##
##if y1 < y2 and y1 < y3:
##    move (x1, y1 - 50)
##    t.write(area)
##elif y2 < y3:
##    move (x2, y2 - 50)
##    t.write(area)
##else:
##    move (x3, y3 - 50)
##    t.write(area)
##
##t.done()
