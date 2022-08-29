## Number 1

##def student_grades (score):
##    if score > 100:
##        grade = 'Invalid'
##    if 80 <= score <= 100:
##        grade = 'A'
##    elif 70 <= score < 80:
##        grade = 'B'
##    elif 60 <= score < 70:
##        grade = 'C'
##    elif 50 <= score < 60:
##        grade = 'D'
##    elif 0<= score < 50:
##        grade = 'F'
##    else:
##        grade = 'Invalid'
##    return grade
##
##score = float(input("Enter your Score: "))
##grade = student_grades(score)
##print("Your Grade: ", grade)


## Number 2

##import turtle
##t = turtle.Turtle()
##
##def square (x):
##    for i in range(4):
##        t.fd(x)
##        t.right(90)
##
##def draw_pattern (x):
##    for i in range(4):
##        count = 0
##        while count < 4:
##            count = 0
##            while count < 4:
##                square(x + (x * count))
##                count = count + 1
##            count = count + 1
##            t.right(90)
##        count = count + 1
##    
##x = int(input("Enter an integer: "))
##t.speed(0)
##draw_pattern(x)


## Number 3

##import turtle
##t = turtle.Turtle()
##
##def draw_polygon (x = 0, y = 0, numSides = 4, size = 100):
##    t.penup()
##    t.goto(x, y)
##    t.pendown()
##    angle = 360 / numSides
##    for i in range (numSides):
##        t.fd(size)
##        t.right(angle)
##
##t.speed(0)
##draw_polygon(10, 10, 5, 200)
##draw_polygon(10, 10, 5)
##draw_polygon(0, 0)


## Number 4

##def sum_of_digits (x):
##    sum = 0
##    for digit in str(x):
##        sum += int(digit)
##    return sum
##
##x = int(input("Enter an integer: "))
##print("Your Summation is: ", sum_of_digits(x))
