from tkinter import *
import tkinter.messagebox
import random

## Number 1

##class Counter:
##
##    def __init__(self):
##        window = Tk()
##        window.title("Counter")
##        self.numCount = 0
##
##        self.label = Label(window, width = 10, text = self.numCount)
##        self.label.grid(row = 2, column = 1)
##
##        self.btAdd = Button(window, width = 10, height = 1, text = "+",
##                            command = self.addition)
##        self.btAdd.grid(row = 1, column = 2)
##
##        self.btSub = Button(window, width = 10, height = 1, text = "-",
##                            command = self.subtraction)
##        self.btSub.grid(row = 2, column = 2)
##
##        self.btReset = Button(window, width = 10, height = 1, text = "RESET",
##                              command = self.reset)
##        self.btReset.grid(row = 3, column = 2)
##
##    def addition(self):
##        self.numCount += 1
##        self.label["text"] = self.numCount
##
##    def subtraction(self):
##        self.numCount -= 1
##        self.label["text"] = self.numCount
##
##    def reset(self):
##        self.numCount = 0
##        self.label["text"] = self.numCount
##
##
##Counter()


## Number 2

##class Converter:
##
##    def __init__(self):
##        window = Tk()
##        window.title("Currency Converter")
##        self.money = IntVar()
##
##        self.entry = Entry(window, width = 20, textvariable = self.money)
##        self.entry.grid(row = 1, column = 1, sticky = W+E)
##
##        self.btTHB = Button(window, width = 20, height = 1,
##                            text = "USD --> THB", command = self.toTHB)
##        self.btTHB.grid(row = 2, column = 1, pady = 3)
##
##        self.btUSD = Button(window, width = 20, height = 1,
##                            text = "THB --> USD", command = self.toUSD)
##        self.btUSD.grid(row = 3, column = 1, pady = 3)
##
##    def toTHB(self):
##        usd = int(self.money.get())
##        thb = int(self.money.get())
##        thb *= 30.00
##
##        tkinter.messagebox.showinfo("USD --> THB", str(usd) + " USD = "
##                            + str(thb) + " THB")
##
##    def toUSD(self):
##        thb = int(self.money.get())
##        usd = int(self.money.get())
##        usd /= 30.00
##
##        tkinter.messagebox.showinfo("THB --> USD", str(thb) + " THB = "
##                            + str(usd) + " USD")
##
##Converter()

        
## Number 3

##class Paint:
##
##    def __init__(self):
##        window = Tk()
##        window.title("Free Hand Painting Program")
##
##        self.canvas = Canvas(window, width = 500, height = 500)
##        self.canvas.grid(row = 1, column = 1)
##
##        self.label = Label(window, text = "Drag the Mouse to draw.")
##        self.label.grid(row = 2, column = 1)
##
##        self.btClear = Button(window, width = 30, text = "Clear",
##                              command = self.clear)
##        self.btClear.grid(row = 3, column = 1)
##
##        self.canvas.bind("<B1-Motion>", self.mouseEvent)
##
##    def mouseEvent(self, event):
##        black = "#000000"
##        x1 = event.x - 10
##        y1 = event.y - 10
##        x2 = event.x + 10
##        y2 = event.y + 10
##        self.canvas.create_oval(x1,y1,x2,y2,fill = black)
##
##    def clear(self):
##        self.canvas.delete("all")
##
##Paint()


## Number 4

##class Paint:
##
##    def __init__(self):
##        window = Tk()
##        window.title("Free Hand Painting Program")
##
##        self.canvas = Canvas(window, width = 350, height = 200)
##        self.canvas.grid(row = 1, column = 1)
##
##        self.label = Label(window, text = "Click the Mouse to draw.")
##        self.label.grid(row = 2, column = 1)
##
##        self.btClear = Button(window, width = 30, text = "Clear",
##                              command = self.clear)
##        self.btClear.grid(row = 3, column = 1)
##
##        self.canvas.bind("<Button-1>", self.mouseEvent)
##        self.canvas.bind("<Leave>", self.mouseEvent2)
##
##    def mouseEvent(self, event):
##        color = ['black', 'red', 'blue', 'yellow', 'green', 'cyan', 'magenta']
##        x1 = event.x - 5
##        y1 = event.y - 5
##        x2 = event.x + 5
##        y2 = event.y + 5
##        self.canvas.create_oval(x1,y1,x2,y2,fill = color[random.randint(0,6)])
##
##    def mouseEvent2(self, event):
##        tkinter.messagebox.showinfo("ERROR","Mouse pointer is not in the rectangle.")
##
##    def clear(self):
##        self.canvas.delete("all")
##
##Paint()
