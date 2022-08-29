package setexample;

// A Java program to demonstrate a Set. 
// Here, you will see how you can add  
// Elements using Set. 
  
import java.util.*; 
  
public class SetExample { 
    
    public static void main(String[] args) 
    { 
        // Set demonstration using HashSet 
        Set<String> Set = new HashSet<>(); 
          
        // Adding Elements   
        Set.add("one"); 
        Set.add("two"); 
        Set.add("three"); 
        Set.add("four"); 
        Set.add("five"); 
          
        // Set follows unordered way.  
        System.out.println(Set); 
    } 
}
