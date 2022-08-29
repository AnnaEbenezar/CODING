## Number 1

print("Phonebook Manager")
print("Press '“'+'”' to add a new contact.")
print("Press '“'-'”' to delete a contact.")
print("Press '“'f'”' to find a contact.")
print("Press '“'p'”' to print out all contacts in the phonebook.")
print("Press '“'q'”' to quit the program.")

phonebook = {}

cmd = str(input("Enter command: "))

while(cmd.lower() != 'q'):

    if(cmd == '+'):
        name = str(input("Enter Contact Name: "))
        num = int(input("Enter Contact Number: "))
        phonebook.update({name:num})

    elif(cmd == '-'):
        del_name = str(input("Enter Contact to be deleted: "))
        if del_name in phonebook:
            del phonebook[del_name]
        else:
            print("Contact not found")

    elif(cmd.lower() == 'f'):
        find = str(input("Enter Contact Name: "))
        if find in phonebook:
            print(phonebook[find])
        else:
            print("Contact not found")

    elif(cmd.lower() == 'p'):
         for contact in phonebook:
             print(contact + ": ", end = '')
             print(phonebook[contact])
             print("")

    else:
        print("Unknown Command!")
    cmd = str(input("Enter command: "))


## Number 2

def find_duplicates(dict):
    list1 = list(dict.values())
    list2 = list(dict)
    dupl_dict = {}
    for i in range (len(list1)):
        if list1.count(list1[i]) > 1:
            dupl_dict[list2[i]] = list1[i]
    return dupl_dict

d1 = {'s5301':'Fred', 's5302':'Harry', 's5303':'John', 's5304':'Fred', 's5305':'Harry'}
print(find_duplicates(d1))

d2 = {'a':'1', 'b':'2', 'c':'1', 'd':'3', 'e':'1', 'f':'2'}
print(find_duplicates(d2))


## Number 3

def inverse(dict):
    reverse = {}
    for key, value in dict.items():
        reverse.setdefault(value, set()).add(key)
    return reverse

print(inverse(d2))


## Number 4

def is_subset(sub, sup):
    for arg in sub:
        if not (arg in sup):
            return False
    return True

sup = set([1, 2, 3, 4])
sub = set([1, 2, 4])
print(is_subset(sub, sup))
sub = set([1, 2, 5])
print(is_subset(sub, sup))


## Number 5

def power(s):
    result = [[]]
    for e in s:
        result += [arg + [e] for arg in result]

    for i in range(len(result)):
        result[i] = frozenset(result[i])
    return set(result)

s = set([1,2,3])
print(power(s))
