/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ArrayListExample;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Casting when pulling out from ArrayList  
        ArrayList<String> names = new ArrayList();
        names.add("Clint");
        names.add("John");
        names.add("Robert");
        names.add("Henry");
        Object obj = names.get(2); //ok
        System.out.println(obj.toString());
        String str1 = names.get(3); //syntax error
        String str2 = (String) (names.get(4)); //ok
        char c = ((String) (names.get(0))).charAt(0);
        //Gack!!

    }

}
