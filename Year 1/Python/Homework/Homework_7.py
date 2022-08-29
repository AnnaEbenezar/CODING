## Number 1

##class Clock():
##    def __init__(self, hour, minute, second):
##        self.__hour = hour
##        self.__minute = minute
##        self.__second = second
##
##    def set_time(self, hour, minute, second):
##        self.setHour(hour)
##        self.setMins(minute)
##        self.setSecs(second)        
##                
##    def setHour(self, hour):
##        if 0 <= hour < 24:
##            self.__hour = hour
##        else:
##            return("No, invalid hour value.")
##
##    def setMins(self, minute):
##        if 0 <= minute < 60:
##            self.__minute = minute
##        else:
##            return("No, invalid minute value.")
##
##    def setSecs(self, second):
##        if 0 <= second < 60:
##            self.__second = second
##        else:
##            return("No, invalid second value.")
##
##    def get_time(self):
##        if (0<=self.__hour<=24 and
##            0<=self.__minute<60 and
##            0<=self.__second<60):
##            m = "AM"
##            if 0 < self.__hour < 12:
##                m = "AM"
##            elif 12 < self.__hour < 24:
##                self.__hour -= 12
##                m = "PM"
##            elif self.__hour == 24:
##                self.__hour = 0
##                m = "AM"
##            else:
##                if self.__hour == 12 and m == "PM":
##                    self.__hour = 0
##                    m = "AM"
##            time = (str(self.__hour) + ":" + str(self.__minute) + ":" +
##                  str(self.__second) + m)
##            return time
##        else:
##            return ("Invalid Value")
##
##    def tick(self):
##        self.__second += 1
##        if self.__second == 60:
##            self.__second = 0
##            self.__minute += 1
##            if self.__minute == 60:
##                self.__minute = 0
##                self.__hour += 1
##                if self.__hour == 24:
##                    self.__hour = 0
##                
##
##t = Clock(23,59,59)
##print(t.get_time())
##t.tick()
##print(t.get_time())
##t.set_time(11, 39, 42)
##print(t.get_time())


## Number 2

##class Poly():
##    def __init__(self, p):
##        self.__p = list(p)
##
##    def add(self, p2):
##        p = self.__p
##        for i in range(len(p)):
##            p[i] += p2[i]
##        return Poly(tuple(p))
##
##    def scalar_multiply(self, c):
##        p = self.__p
##        for i in range(len(p)):
##            p[i] *= c
##        return Poly(tuple(p))
##
##    def multiply(self, p2):
##        p1 = self.__p
##        ans = [0] * (len(p1) + len(p2) - 1)
##        for i in range(len(p1)):
##            for j in range(len(p2)):
##                ans[i+j] += p1[i] * p2[j]
##        self.__p = ans
##        return tuple(self.__p)
##    
##    def power(self, c):
##        p = list(self.__p)
##        p2 = list(self.__p)
##        for i in range(c - 1):
##            p = self.multiply(p2)
##        return Poly(tuple(p))
##            
##    def diff(self):
##        for i in range(len(self.__p) - 1):
##            self.__p[i] = self.__p[i+1] * (i + 1)
##        self.__p.pop(-1)
##        return Poly(tuple(self.__p))
##    
##    def integrate(self):
##        p = self.__p
##        p.append(0)
##        for i in range((len(p)-1), 0, -1):
##            p[i] = p[i-1] / i
##        p[0] = 0
##        return Poly(tuple(p))
##    
##    def eval(self, c):
##        p = self.__p
##        ans = 0
##        for i in range(len(p)):
##            ans += (p[i] * (c ** i))
##        print(ans)
##    
##    def print(self):
##        p = self.__p
##        for i in range(len(p)):
##            if p[i] != 0:
##                if i == 0:
##                    if p[i] > 0 and p[i] != 0:
##                        print(p[i], end = ' ')
##                        print('+', end = ' ')
##                    else:
##                        print(p[i], end = ' ')
##                elif i == 1:
##                    if p[i] > 0 and p[i] != 0:
##                        print(p[i], 'x', sep = '', end = ' ')
##                    else:
##                        print(p[i], 'x', sep = '', end = ' ')
##                elif i < len(p) - 1:
##                    if p[i] < 0 and p[i] != 0:
##                        print('+', end = ' ')
##                        print(p[i],'x^',i, sep = '',end = ' ')
##                    else:
##                        print(p[i],'x^',i, sep = '',end = ' ')
##                else:
##                    if p[i] > 0 and p[i] != 0:
##                        print('+', end = ' ')
##                        print(p[i],'x^',i, sep = '',end = ' ')
##                    else:
##                        print(p[i],'x^',i, sep = '',end = ' ')


## Number 3

##class LinearEquation():
##    def __init__(self, a, b, c, d, e, f):
##        self.__a = a
##        self.__b = b
##        self.__c = c
##        self.__d = d
##        self.__e = e
##        self.__f = f
##
##    def get_a(self):
##        return self.__a
##
##    def get_b(self):
##        return self.__b
##
##    def get_c(self):
##        return self.__c
##
##    def get_d(self):
##        return self.__d
##
##    def get_e(self):
##        return self.__e
##
##    def get_f(self):
##        return self.__f
##
##    def isSolvable(self):
##        if ((self.__a * self.__d) - (self.__b * self.__c)) !=0:
##            return True
##        else:
##            return False
##
##    def getX(self):
##        if self.isSolvable() == True:
##            x = (((self.__e * self.__d) - (self.__b * self.__f)) /
##                 ((self.__a * self.__d) - (self.__b * self.__c)))
##            return x
##        else:
##            return "Unsolvable"
##
##    def getY(self):
##        if self.isSolvable() == True:
##            y = (((self.__a * self.__f) - (self.__e * self.__c)) /
##                 ((self.__a * self.__d) - (self.__b * self.__c)))
##            return y
##        else:
##            return "Unsolvable"
##            
##        
##l = LinearEquation(4,2,6,9,1,7)
##print(l.isSolvable())
##print(l.getX())
##print(l.getY())




























            
        
