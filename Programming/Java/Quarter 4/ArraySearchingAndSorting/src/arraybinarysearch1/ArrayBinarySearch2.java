package arraybinarysearch1;

import java.util.*; 
  
public class ArrayBinarySearch2 { 
  
    // Main function 
    public static void main(String args[]) throws Exception 
    { 
  
        // Unsorted Array 
        int array[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }; 
  
        // Sorting the array 
        Arrays.sort(array); 
  
        // Printing sorted array 
        System.out.println("Sorted Array:"); 
        for (int i = 0; i < array.length; i++) { 
            System.out.print(array[i] + " "); 
        } 
        System.out.println(); 
  
        // Using binarySearch to search for desired element 
        int index = Arrays.binarySearch(array, 0); 
  
        // Printing result 
        if (index >= 0) 
            System.out.println("Element 2 found at index: "
                               + index); 
        else
            System.out.println("Element not found"); 
    } 
}

