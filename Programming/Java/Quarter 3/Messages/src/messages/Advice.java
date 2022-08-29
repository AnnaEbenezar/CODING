/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messages;

/**
 *
 * @author Amy
 */
public class Advice extends Thought
{
public void message()
{
    System.out.println("Warning: Dates in calendar are closer " + 
            
        "than they appear");
            
    System.out.println();
    
    super.message();
}
}
