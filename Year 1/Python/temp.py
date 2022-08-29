##from datetime import datetime
##
##class SavingAccount:
##    def __init__(self, balance, transaction_history:list, passbook:dict):
##        assert balance >= 0, f"Balance {balance} cannot be less that 0"
##        self.transaction_history = transaction_history
##            
##    def deposit(self, money, date):
##        self.balance += money
##        self.transaction_history.append(f"deposit {money} on {date}")
##
##    def Expenses(self, money, date):
##        if self.balance - money < 0:
##            print("Can't spend money you dont have!")
##        else:
##            self.balance -= money
##            self.transaction_history.append(f"withdraw {money} on {date}")
##
##    def get_balance(self):
##        print(self.balance)
##
##    def print_statement(self):
##        print(self.transaction_history)
##
##phonebook = {}
##
##now = datetime.now()
##
##current_time = now.strftime("%H:%M:%S")
##
##print("Current Time is :", current_time)
##
##while(cmd.lower() != 'q'):
##
##    if(cmd == '+'):
##        date = current_time
##        amt = int(input("Enter Contact Number: "))
##        phonebook.update({date-time:amt})
##
##    elif(cmd == '-'):
##        del_name = str(input("Enter Contact to be deleted: "))
##        if del_name in phonebook:
##            del phonebook[del_name]
##        else:
##            print("Contact not found")
##
##    elif(cmd.lower() == 'f'):
##        find = str(input("Enter Contact Name: "))
##        if find in phonebook:
##            print(phonebook[find])
##        else:
##            print("Contact not found")
##
##    elif(cmd.lower() == 'p'):
##         for contact in phonebook:
##             print(contact + ": ", end = '')
##             print(phonebook[contact])
##             print("")
##
##    else:
##        print("Unknown Command!")
##    cmd = str(input("Enter command: "))
##
##
##import tkinter as tk
##from tkcalendar import DateEntry
##
##root = tk.Tk()
##cal = DateEntry(root, width=12, year=2019, month=6, day=22, 
##background='darkblue', foreground='white', borderwidth=2)
##cal.pack(padx=10, pady=10)
##date = cal.get_date()
##print(date)
##root.mainloop()
##

from tkinter import *
#from tkinter import ttk


class ExpenseTracker:

    def __init__(self):
        window = Tk()
        window.title("MyCash")
        window.geometry('700x700')

        # setting button switch state
        self.btn_state = False

        # get icon images
        self.nav_icon = PhotoImage(file='navbar3.png')
        self.close_icon = PhotoImage(file='close_icon3.png')

        # frame for NavBar icon
        self.frame = Frame(window, bg='black')
        self.frame.pack(side='top', fill=X)

        # NavBar button
        self.navbar_btn = Button(self.frame, image=self.nav_icon,
                                 bg='white', bd=0, command=self.switch)
        self.navbar_btn.grid(row=1, column=1)

        # label to display selected menu option
        self.label = Label(window, font='ariel 18 bold')
        self.label.place(x=60, y=250)

        # frame for NavBar
        self.NavBar = Frame(window, bg='black', height=1000, width=250)
        self.NavBar.place(x=-250, y=0)

        # NavBar options
        self.option1 = Button(self.NavBar, text='HOME', font='ariel 18 bold', bg='black', fg='white',
                              activebackground='gray', activeforeground='white', bd=0,
                              command=self.option_selected1).place(x=25, y=120)
        self.option2 = Button(self.NavBar, text='EXPENSES', font='ariel 18 bold', bg='black', fg='white',
                              activebackground='gray', activeforeground='white', bd=0,
                              command=lambda msg='You selected Java': self.option_selected(msg)).place(x=25, y=120)
        # self.option3 = Button(self.NavBar, text='Python', font='ariel 18 bold', bg='black', fg='white',
        #                       activebackground='gray', activeforeground='white', bd=0,
        #                       command=lambda msg='You selected Python': self.option_selected(msg)).place(x=25, y=180)

        # NavBar close button
        self.close_btn = Button(self.NavBar, image=self.close_icon,
                                bg='white', bd=0, command=self.switch)
        self.close_btn.place(x=180, y=5)

        

        window.mainloop()

    def switch(self):
        if self.btn_state is True:
            # close NavBar
            for x in range(251):
                self.NavBar.place(x=-x, y=0)
                self.frame.update()
            self.frame.config(bg='black')

            # set button state off
            self.btn_state = False

        else:
            # Open NavBar
            for x in range(-250, 0):
                self.NavBar.place(x=x, y=0)
                self.frame.update()
            self.frame.config(bg='SystemButtonFace')

            # set button state ON
            self.btn_state = True

    def option_selected1(self):
        self.switch()
        self.btn1 = Button(window, width = 20, height = 1,
                            text = "THB --> USD", command = toUSD)

    def toUSD(self):
        thb = int(self.money.get())
        usd = int(self.money.get())
        usd /= 30.00

        tkinter.messagebox.showinfo("THB --> USD", str(thb) + " THB = "
                            + str(usd) + " USD")


ExpenseTracker()

