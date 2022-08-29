## Number 1

##class Time:
##    def __init__(self, hours=0, mins=0, secs=0):
##        self.hour = hours
##        self.mins = mins
##        self.secs = secs
##
##    def printTime(self):
##        if  (0 <= self.hour < 24 and 0 <= self.mins < 60 and 0 <= self.secs < 60):
##            print(str(self.hour) + ":" + str(self.mins) + ":" +
##                  str(self.secs) + " Hrs.")
##        else:
##            print("No weird time")
##
##time1 = Time(23,15,0)
##time1.printTime()
##time2 = Time(26,-6,5)
##time2.printTime()


## Number 2

##class BankAccount:
##    def __init__(self, bank_name, owner_name, acc_number, current_balance):
##        self.bank = bank_name
##        self.owner = owner_name
##        self.account = acc_number
##        self.balance = current_balance
##
##    def depositMoney(self, deposit):
##        self.balance = self.balance + deposit
##        print("Amount Deposited: $", deposit)
##        print("Current Balance: $", self.balance)
##
##    def withdrawMoney(self, withdrawal):
##        if self.balance < withdrawal:
##            print("Withdrawal not possible.")
##        else:
##            self.balance = self.balance - withdrawal
##            print("Amount Withdrawn: $", withdrawal)
##            print("Current Balance: $", self.balance)
##
##    def currentBalance(self):
##        print("Current Balance: $", self.balance)
##
##acc1 = BankAccount("BOA", "Amy", "64011393", 100)
##acc1.depositMoney(50)
##acc1.withdrawMoney(200)

## Number 3

##import turtle as t
##import math as m
##
##class Rectangle:
##    def __init__(self, x, y, width, height):
##        self.xCor = x
##        self.yCor = y
##        self.width = width
##        self.height = height
##
##    def getArea(self):
##        area = self.width * self.height
##        return area
##
##    def getPerimeter(self):
##        perimeter = (self.width * 2) + (self.height * 2)
##        return perimeter
##
##    def move(self, newX, newY):
##        self.xCor = newX
##        self.yCor = newY
##
##    #def intersect(self, 
##
##    def draw(self):
##        t.penup()
##        t.goto(self.xCor, self.yCor)
##        t.pendown()
##        for i in range (2):
##            t.fd(self.width)
##            t.right(90)
##            t.fd(self.height)
##            t.right(90)
##
##class Circle:
##    def __init__(self, x, y, radius):
##        self.xCor = x
##        self.yCor = y
##        self.radius = radius
##
##    def getArea(self):
##        area = m.pi * (self.radius * self.radius)
##        return area
##
##    def getCircumference(self):
##        circumference = 2 * m.pi * self.radius
##        return circumference
##
##    def move(self, newX, newY):
##        self.xCor = newX
##        self.yCor = newY
##
##    def draw(self):
##        t.penup()
##        t.goto(self.xCor,self.yCor)
##        t.fd(self.radius)
##        t.pendown()
##        t.circle(self.radius)
##
##
##cir1 = Circle(0,0,50)
##cir1.draw()


## Number 4

##import math as m
##
##class QuadraticEquation:
##    def __init__(self, a, b, c):
##        self.__a = a
##        self.__b = b
##        self.__c = c
##
##    def getA(self):
##        return self.__a
##
##    def getB(self):
##        return self.__b
##
##    def getC(self):
##        return self.__c
##
##    def getDiscriminant(self):
##        discriminant = m.pow(self.__b, 2) - (4 * self.__a * self.__c)
##        return discriminant
##
##    def getRoot1(self):
##        if self.getDiscriminant() > 0:
##            root1 = ( ( -self.__b + m.sqrt( self.getDiscriminant() ) ) / (2 * self.__a) )
##            return root1
##
##        else:
##            return 0
##
##    def getRoot2(self):
##        if self.getDiscriminant() > 0:
##            root2 = ( ( -self.__b - m.sqrt( self.getDiscriminant() ) ) / (2 * self.__a) )
##            return root2
##
##        else:
##            return 0
##
##q = QuadraticEquation(1, -5, -14)
##print(q.getDiscriminant(), q.getRoot1(), q.getRoot2())

        
    
