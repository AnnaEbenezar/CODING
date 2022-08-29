import turtle as t
from abc import ABC

## Number 1

class TwoDShape(ABC):

    def draw(self):
        pass

class Line(TwoDShape):

    def __init__(self, sX, sY, eX, eY):
        self.start_x = sX
        self.start_y = sY
        self.end_x = eX
        self.end_y = eY

    def draw(self):
        t.pu()
        t.goto(self.start_x, self.start_y)
        t.pd()
        t.goto(self.end_x, self.end_y)

class Rectangle(TwoDShape):

    def __init__(self, width, height, sX, sY):
        self.w = width
        self.h = height
        self.start_x = sX
        self.start_y = sY

    def draw(self):
        t.pu()
        t.goto(self.start_x, self.start_y)
        t.pd()
        for i in range (2):
            t.fd(self.w)
            t.right(90)
            t.fd(self.h)
            t.right(90)

class Circle(TwoDShape):

    def __init__(self, radius, sX, sY):
        self.rad = radius
        self.start_x = sX
        self.start_y = sY

    def draw(self):
        t.pu()
        t.goto(self.start_x, self.start_y)
        t.pd()
        t.circle(self.rad)


## Number 2

class Square(TwoDShape):

    def __init__(self, sideL, sX, sY):
        self.length = sideL
        self.start_x = sX
        self.start_y = sY

    def draw(self):
        t.pu()
        t.goto(self.start_x, self.start_y)
        t.pd()
        for i in range(4):
            t.fd(self.length)
            t.right(90)

l = Line(10, 10, 60, 60)
l.draw()

r = Rectangle(80, 50, 100, 80)
r.draw()

c = Circle(30, -20, 45)
c.draw()

s = Square(100, 150, 150)
s.draw()


## Number 3

class Transportation(ABC):

    def __init__(self, start_place, end_place, distance):
        self.start = start_place
        self.end = end_place
        self.distance = distance

    @abc.abstractmethod
    def find_cost(self):
        cost = 0
        pass

class Walk(Transportation):

    def __init__(self, start_place, end_place, distance):
        super().__init__(start_place, end_place, distance)

    def find_cost(self):
        cost = 0
        return cost

class Taxi(Transportation):

    def __init__(self, start_place, end_place, distance):
        super().__init__(start_place, end_place, distance)

    def find_cost(self):
        price = 40
        cost = self.distance * price
        return cost

class Train(Transportation):

    def __init__(self, start_place, end_place, distance, station):
        super().__init__(start_place, end_place, distance)
        self.station = station

    def find_cost(self):
        price = 5
        cost = self.station * price
        return cost









    
