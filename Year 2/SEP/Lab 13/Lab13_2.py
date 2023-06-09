from ast import Store
import ZODB, ZODB.FileStorage
import persistent
from abc import ABC, abstractmethod
import BTrees._OOBTree
import transaction
from accounts_2 import *

storage = ZODB.FileStorage.FileStorage('mydata.fs')
db = ZODB.DB(storage)
connection = db.open()
root = connection.root

if __name__ == "__main__":
    root.customers = BTrees.OOBTree.BTree()
    root.customers["Jone"] = Customer("Jone")
    root.customers["Mary"] = Customer("Mary")
    j = root.customers["Jone"]
    m = root.customers["Mary"]
    j.printStatus()

    a = j.addAccount(SavingAccount(100, j))
    b = j.addAccount(CurrentAccount(200, j))
    c = m.addAccount(SavingAccount(1000, m))

    c.transfer(100, a)
    
    a.transfer(150, b)

    b.deposit(500)

    b.withdraw(50)

    b.transfer(200, c)

    c.withdraw(250)

    print()
    print("Account C")
    print()
    c.printBankTransaction()

    transaction.commit()