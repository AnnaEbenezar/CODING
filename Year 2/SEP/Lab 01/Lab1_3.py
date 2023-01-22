#Returns index of x in arr if present, else -1
def binary_search(my_list, low, high, x):
 
    # Check base case
    if high >= low:
 
        mid = (high + low) // 2
 
        # If element is present at the middle itself
        if my_list[mid] == x:
            return mid
 
        # If element is smaller than mid, then it can only
        # be present in left subarray
        elif my_list[mid] > x:
            return binary_search(my_list, low, mid - 1, x)
 
        # Else the element can only be present in right subarray
        else:
            return binary_search(my_list, mid + 1, high, x)
 
    else:
        # Element is not present in the array
        return False
 
# Test array
my_list = [ 2, 3, 4, 10, 40 ]
x = 11
 
# Function call
result = binary_search(my_list, 0, len(my_list)-1, x)
print(result)
 
# if result != -1:
#     print(str(result))
# else:
#     print("False")


