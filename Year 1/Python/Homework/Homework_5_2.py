import turtle

def goNoPen(x, y):
    t.penup()
    t.goto(x, y)
    t.pendown()

w = 20
h = 15
startPoint = 5

weekday = ['Su','Mo','Tu','We','Th','Fr','Sa']
dayMonth = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

t = turtle.Turtle()
sc =turtle.Screen()
sc.screensize(300,1000)


for m in range(0,12):
    if m%4 == 0:
        goNoPen(-300 + m*50, 450)
    days = dayMonth[m]
    for i in range(2):
        t.fd(w7)
        t.rt(90)
        t.fd(h)
        t.rt(90)
    goNoPen(t.xcor()+w, t.ycor()-h/1.2)
    header = "Month #" + str(m+1)
    t.write(header)
    goNoPen(t.xcor()-w, t.ycor()+h/1.2)
    goNoPen(t.xcor(), t.ycor()-h)
    for i in range(7):
        for j in range(2):
            t.fd(w)
            t.rt(90)
            t.fd(h)
            t.rt(90)
        goNoPen(t.xcor()+w/0.3, t.ycor()-h/1.2)
        t.write(weekday[i])
        goNoPen(t.xcor() + w/0.7, t.ycor() + h / 1.2)
    goNoPen(t.xcor()-w*7, t.ycor()-h)
    date = 1
    tablePoint = 0
    dayPoint = startPoint
    while date <= days:
        for i in range(7):
            for j in range(2):
                t.fd(w)
                t.rt(90)
                t.fd(h)
                t.rt(90)
            strdate = str(date)

            if tablePoint >= dayPoint and date <= days:
                goNoPen(t.xcor() + w * 0.3, t.ycor() - h / 1.2)
                t.write(strdate)
                goNoPen(t.xcor() + w * 0.7, t.ycor() + h / 1.2)
                date += 1
            else:
                goNoPen(t.xcor() + w, t.ycor())
            tablePoint += 1
        goNoPen(t.xcor() - w*7, t.ycor()-h)
    startPoint = (startPoint + dayMonth[m])%7
    goNoPen(t.xcor(), t.ycor()-h)
