## Number 1
##[https://www.geeksforgeeks.org/
##convert-time-from-24-hour-clock-to-12-hour-clock-format/?ref=rp]

##def convert12(time):
##
##    ## Get Hours
##    h1 = ord(time[0]) - ord('0')
##    h2 = ord(time[1]) - ord('0')
##
##    hh = h1 * 10 + h2
##
##    ## Finding out the Meridian of the time (AM/PM)
##    if hh < 12:
##        Meridian = "AM"
##    else:
##        Meridian = "PM"
##
##    hh %= 12
##
##    ## Handle 00 and 12 separately
##    if hh == 0:
##        print("12", end = "")
##
##        for i in range(2, 5):
##            print(time[i], end = "")
##    else:
##        print(hh, end = "")
##
##        for i in range(2, 5):
##            print(time[i], end = "")
##
##    return(" " + Meridian)
##
##time = str(input("Input the time: "))
##print(convert12(time))
      

## Number 2

##import turtle
##t = turtle.Turtle()
##
##months_year = ["January 2021", "February 2021", "March 2021", "April 2021",
##               "May 2021", "June 2021", "July 2021", "August 2021",
##               "September 2021", "October 2021", "November 2021", "December 2021",]
##days_week = ["Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"]
##month_start = [5,1,1,4,6,2,4,0,3,5,1,3]
##days_month = [31,28,31,30,31,30,31,31,30,31,30,31]
##
##def gridded_calendar(month):
##    t.speed(0)
##    if month == 1 or month == 5 or month == 10:
##        for a in range (3):
##            for b in range (7):
##                for c in range (2):
##                    t.fd(21)
##                    t.left(90)
##                    t.fd(14)
##                    t.left(90)
##                t.fd(21)
##            t.left(90)
##            t.fd(14)
##            t.left(90)
##
##            for b in range (7):
##                for c in range (2):
##                    t.fd(21)
##                    t.right(90)
##                    t.fd(14)
##                    t.right(90)
##                t.fd(21)
##            t.right(90)
##            t.fd(14)
##            t.right(90)
##
##        for b in range (7):
##            for c in range (2):
##                t.fd(21)
##                t.left(90)
##                t.fd(14)
##                t.left(90)
##            t.fd(21)
##        t.left(90)
##        t.fd(28)
##        t.left(90)
##        t.fd(147)
##        t.left(90)
##        t.fd(14)
##        t.left(90)
##    else:
##        for a in range (3):
##            for b in range (7):
##                for c in range (2):
##                    t.fd(21)
##                    t.left(90)
##                    t.fd(14)
##                    t.left(90)
##                t.fd(21)
##            t.left(90)
##            t.fd(14)
##            t.left(90)
##
##            for b in range (7):
##                for c in range (2):
##                    t.fd(21)
##                    t.right(90)
##                    t.fd(14)
##                    t.right(90)
##                t.fd(21)
##            t.right(90)
##            t.fd(14)
##            t.right(90)
##        t.left(90)
##        t.fd(14)
##        t.right(90)
##        t.fd(147)
##        t.right(90)
##        t.fd(14)
##        t.right(90)
##        t.fd(147)
##
##def newline():
##    t.penup()
##    t.bk(147)
##    t.right(90)
##    t.fd(14)
##    t.setheading(0)
##    t.pendown()
##
##def writeDay(n):
##    t.setheading(0)
##    t.penup()
##    t.fd(49)
##    t.pendown()
##    t.write(months_year[n])
##    t.penup()
##    t.bk(44)
##    t.right(90)
##    t.fd(14)
##    t.setheading(0)
##    t.pendown()
##    i = 0
##    while(i < 7):
##        t.write(days_week[i])
##        t.penup()
##        t.fd(21)
##        t.pendown()
##        i += 1
##    t.penup()
##    t.bk(147)
##    t.right(90)
##    t.fd(14)
##    t.setheading(0)
##    t.pendown()
##    k = 0
##    sd = month_start[n]
##    while(k < sd):
##        t.fd(21)
##        k += 1
##    j = 1
##    for k in range(7 - sd):
##        t.write(j)
##        t.penup()
##        t.fd(21)
##        t.pendown()
##        j += 1
##    newline()
##    ad = days_month[n]
##    if n == 2 or n == 5:
##        x = 5
##    else :
##        x = 4
##    for i in range(x):
##        for k in range(7):
##            if j == ad:
##                t.write(j)
##                break
##            elif j < ad:
##                t.write(j)
##                t.penup()
##                t.fd(21)
##                t.pendown()
##                j += 1
##        newline()
##
##def draw_calendar(momo):
##    gridded_calendar(momo-1)
##    writeDay(momo-1)
##
##draw_calendar(9)
            

## Number 3

import turtle
t = turtle.Turtle()

def move(x, y):
    t.penup()
    t.goto(x, y)
    t.pendown()

def draw_rectangle(width, length):
    for i in range(2):
        t.fd(width)
        t.right(90)
        t.fd(length)
        t.right(90)

def draw_polygon():
    t.fd(len1)
    t.right(ang1)
    t.fd(wid1)

def draw_parallelogram(size):
    t.left(26.57)
    for i in range (2):
        t.fd(size * 2.6)
        t.right(26.57)
        t.fd(size * 0.45)
        t.right(153.43)
    t.setheading(0)

def uk_flag (size):
    length = size / 2
    draw_rectangle(size, length)
    ## Red
    t.color("#cf142b")
    move ((size * 9/20), 0)
    t.begin_fill()
    draw_rectangle((size/10), length)
    t.end_fill()
    move (0, -(length * 2/5))
    t.begin_fill()
    draw_rectangle(size, (length/5))
    t.end_fill()
    move(0, -length)
    t.begin_fill()
    draw_parallelogram(size/4)
    t.end_fill()
    
    
uk_flag(200)
##draw_parallelogram(50) 


## Number 4

##def one_to_9teen (num):
##    if num == 1:
##        englishPro = ("one")
##    elif num == 2:
##        englishPro = ("two")
##    elif num == 3:
##        englishPro = ("three")
##    elif num == 4:
##        englishPro = ("four")
##    elif num == 5:
##        englishPro = ("five")
##    elif num == 6:
##        englishPro = ("six")
##    elif num == 7:
##        englishPro = ("seven")
##    elif num == 8:
##        englishPro = ("eight")
##    elif num == 9:
##        englishPro = ("nine")
##    elif num == 10:
##        englishPro = ("ten")
##    elif num == 11:
##        englishPro = ("eleven")
##    elif num == 12:
##        englishPro = ("twelve")
##    elif num == 13:
##        englishPro = ("thirteen")
##    elif num == 14:
##        englishPro = ("fourteen")
##    elif num == 15:
##        englishPro = ("fifteen")
##    elif num == 16:
##        englishPro = ("sixteen")
##    elif num == 17:
##        englishPro = ("seventeen")
##    elif num == 18:
##        englishPro = ("eighteen")
##    elif num == 19:
##        englishPro = ("nineteen")
##    return englishPro
##
##def tensPro (num):
##    if num == 2:
##        englishProT = ("twenty")
##    elif num == 3:
##        englishProT = ("thirty")
##    elif num == 4:
##        englishProT = ("fourty")
##    elif num == 5:
##        englishProT = ("fifty")
##    elif num == 6:
##        englishProT = ("sixty")
##    elif num == 7:
##        englishProT = ("seventy")
##    elif num == 8:
##        englishProT = ("eighty")
##    elif num == 9:
##        englishProT = ("ninety")
##    return englishProT
##
##def hundredsPro (num):
##    if num == 2:
##        englishProH = ("two hundred")
##    elif num == 3:
##        englishProH = ("three hundred")
##    elif num == 4:
##        englishProH = ("four hundred")
##    elif num == 5:
##        englishProH = ("five hundred")
##    elif num == 6:
##        englishProH = ("six hundred")
##    elif num == 7:
##        englishProH = ("seven hundred")
##    elif num == 8:
##        englishProH = ("eight hundred")
##    elif num == 9:
##        englishProH = ("nine hundred")
##    return englishProH
##
##def english_pronunciation (integer):
##    remaining_digits = integer
##
##    if remaining_digits > 99:
##        hundreds = remaining_digits // 100
##        hunds = hundredsPro(hundreds)
##        remaining_digits = remaining_digits % 100
##        if 0 < remaining_digits < 20:
##            children = one_to_9teen(remaining_digits)
##            pronunciation = (str(hunds) + " and " + str(children))
##        else:
##            tens = remaining_digits // 10
##            tens = tensPro(tens)
##            remaining_digits = remaining_digits % 10
##            children = one_to_9teen(remaining_digits)
##            pronunciation = (str(hunds) + " and " + str(tens) + "-" + str(children)) 
##
##    elif 0 < remaining_digits < 20:
##        children = one_to_9teen(remaining_digits)
##        pronunciation = (children)
##        
##    else:
##        tens = remaining_digits // 10
##        tens = tensPro(tens)
##        remaining_digits = remaining_digits % 10
##        children = one_to_9teen(remaining_digits)
##        pronunciation = (str(tens) + "-" + str(children))
##    return pronunciation
##  
##       
##theNums = int(input("Enter an integer between 1 & 999: "))
##if 0 < theNums < 1000:
##    print(english_pronunciation(theNums))
##else:
##    print("I don't know.")



## Number 5

##def bank_notes (money):
##    current_amount = money
##
##    thousands = current_amount // 1000
##    current_amount = current_amount % 1000
##
##    five_hundreds = current_amount // 500
##    current_amount = current_amount % 500
##
##    one_hundreds = current_amount // 100
##    current_amount = current_amount % 100
##
##    fifties = current_amount // 50
##    current_amount = current_amount % 50
##
##    twenties = current_amount // 20
##    current_amount = current_amount % 20
##
##    tens = current_amount // 10
##    current_amount = current_amount % 10
##
##    fives = current_amount // 5
##    current_amount = current_amount % 5
##
##    twos = current_amount // 2
##    current_amount = current_amount % 2
##
##    ones = current_amount
##
##    your_amount = print("Your amount ", money, " consists of:\n",
##                   "1000-Baht notes: ", thousands, "\n",
##                   "500-Baht notes: ", five_hundreds, "\n",
##                   "100-Baht notes: ", one_hundreds, "\n",
##                   "50-Baht notes: ", fifties, "\n",
##                   "20-Baht notes: ", twenties, "\n",
##                   "10-Baht coins: ", tens, "\n",
##                   "5-Baht coins: ", fives, "\n",
##                   "2-Baht coins: ", twos, "\n",
##                   "1-Baht coins: ", ones, "\n",)
##
##    return your_amount
##
##money = int(input("Input the amount of money: "))
##bank_notes(money)


## Number 6

##def reverse (theNums):
##    str(theNums)
##    reverse_list = theNums[::-1]
##    return reverse_list
##
##theNumbers = input("Input an integer: ")
##print("Your Numbers: ", reverse(theNumbers))
