package arraybinarysearch1;

import java.util.*; 
  
public class ArrayBinarySearch1 { 
  
    // Main function 
    public static void main(String args[]) throws Exception 
    { 
  
        // Sorted Array 
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
  
        // Using binarySearch to search for desired element 
        int index = Arrays.binarySearch(array, 2); 
  
        // Printing result 
        if (index >= 0) 
            System.out.println("Element 2 found at index: "
                               + index); 
        else
            System.out.println("Element not found"); 
    } 
}

