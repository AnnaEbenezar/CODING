package mapexample;

// A sample program to demonstrate Map.   
// Here, you will see how you 
// can add elements using Map 

import java.util.*; 

class MapExample { 

public static void main(String args[]) 

{ 
// Creating object for Map. 
    Map<Integer, String> map 
            = new HashMap<>(); 

// Adding Elements using Map. 

map.put(100, "Jerry"); 
map.put(101, "John"); 
map.put(102, "David"); 

map.entrySet().forEach((m) -> {
    System.out.println(m.getKey() + " " + m.getValue());
    }); 

} 
}

