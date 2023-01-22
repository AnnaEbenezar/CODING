class Time:
    def __init__(self, hours=0, mins=0, secs=0):
       self.hour = hours
       self.mins = mins
       self.sec = secs

    def get_hour(self):
        return self.hour

    def set_hour(self,hour):
        self.hour = hour

    def get_min(self):
        return self.min

    def set_min(self, min):
        self.min = min

    def get_sec(self):
        return self.sec

    def set_sec(self, secs):
        self.sec = secs
   
    def printTime(self):
       if  (0 <= self.hour < 24 and 0 <= self.mins < 60 and 0 <= self.sec < 60):
           print(str(self.hour) + ":" + str(self.mins) + ":" +
                 str(self.sec) + " Hrs.")
       else:
           print("No weird time")

time1 = Time(23,15,22)
time1.printTime()
time2 = Time(26,-6,5)
time2.printTime()