import math as m

## Number 1

class Point(object):

    def __init__(self, x=0.0, y=0.0):
        self.x = x
        self.y = y

    def printInfo(self):
        return print("Position: %d, %d;" %(self.x, self.y))

class Circle(Point):

    def __init__(self, x=0, y=0, radius=0.00):
        super().__init__(x, y)
        self.radius = radius

##    def getRadius(self):
##        return self.radius
##
##    def setRadius(self, radius):
##        self.radius = radius

    def area(self):
        return (m.pi * (self.radius ** 2))

    def printCInfo(self):
        return print("%s Radius = %.2f Area = %.2f"
                     %(super().printInfo(), self.radius, self.area()))

class Cylinder(Circle):

    def __init__(self, x=0, y=0, radius=0.00, height = 0.00):
        super().__init__(x, y, radius)
        self.height = height

    def area(self):
        return (2 * super().area() + 2 * m.pi * self.radius * self.height)

    def volume(self):
        return (super().area() * self.height)

    def printInfo(self):
        return print("%s Height = %.2f Volume = %.2f"
                     %(super().printInfo(), self.height, self.volume()))

##circle = Circle(2, 2, 2)
##print(circle.area())
##circle.printCInfo()


## Number 2

class Calculator(object):

    def __init__(self, acc):
        self.acc = acc

    def set_accumulator(self, a):
        self.acc = a

    def get_accumulator(self):
        return self.acc

    def add(self, x):
        self.acc += x
        #return self.acc

    def sub(self, x):
        self.acc -= x
        #return self.acc

    def mul(self, x):
        self.acc *= x
        #return self.acc

    def div(self, x):
        if x == 0:
            return "Error"
        else:
            self.acc /= x
            #return self.acc

    def print_result(self):
        return print("Result: %.2f" %(self.acc))

class Sci_calc(Calculator):

    def __init__(self, acc):
        super().__init__(acc)

    def square(self):
        self.acc = super().mul(self.acc)
        #return self.acc

    def exp(self, x):
        temp = self.acc
        for i in range(1,x):
            self.acc = super().mul(self.acc)
        #return self.acc

    def fac(self):
        self.acc = m.factorial(self.acc)
        #return self.acc

    def print_result(self):
        return print("%.2e" %(self.acc))


## Number 3

class Name(object):

    def __init__(self, title, firstName, lastName):
        self.title = title
        self.fN = firstName
        self.lN = lastName

    def setName(self, t, f, l):
        self.title = t
        self.fN = f
        self.lN = l

    def getFullName(self):
        return print("%s.%s %s" %(self.title, self.fN, self.lN))

class Date(object):

    def __init__(self, day, month, year):
        self.day = day
        self.month = month
        self.year = year

    def setDate(self, d, m, y):
        self.day = d
        self.month = m
        self.year = y

    def getDate(self):
        return print("%02d/%02d/%04d" %(self.day, self.month, self.year))

    def getDateBC(self):
        return print("%02d/%02d/%04d" %(self.day, self.month, self.year + 543))

class Address(object):

    def __init__(self, houseNo, street, district, city, country, postcode):
        self.houseNo = houseNo
        self.street = street
        self.district = district
        self.city = city
        self.country = country
        self.postcode = postcode

    def setAddress(self, houseNo, street, district, city, country, postcode):
        self.houseNo = houseNo
        self.street = street
        self.district = district
        self.city = city
        self.country = country
        self.postcode = postcode

    def getAddress(self):
        return ("House No: %s, Street: %s, District: %s City: %s Country: %s Postcode: %s"
                (self.houseNo, self.street, self.district, self.city,
                 self.country, self.postcode))

class Department(object):

    def __init__(self,description,manager,employeelist):
        self.des  = description
        self.man = manager
        self.list = employeelist

    def addEmployee(self,e):
        self.list.append(e)
        e.department = self.des

    def deleteEmpolyee(self,e):
        self.list.remove(e)
        e.department = 'NULL'

    def setManager(self,e):
        if( type(e)==PermEmployee) and (e in self.list):
            self.man = e
        else: return "Not a permanent employee or not in the list"

    def printinfo(self):
        str1 = ""
        for i in range (len(self.list)):
            str1+=self.list[i].printinfo()
            str1+="              "
        return ("Department : "+self.des+"Manager : "+self.man.first+"Employeelist : "+str1)
    

        

    

    


