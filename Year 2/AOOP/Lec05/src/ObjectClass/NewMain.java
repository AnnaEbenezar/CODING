/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ObjectClass;

/**
 *
 * @author HP
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Object object1, object2;
        object1 = new Object();
        object2 = new Object();
        System.out.println(object1.equals(object2));
        object1 = object2;
        System.out.println(object1.equals(object2));
        
        String str1 = "Java";
        String str2 = new String("Java");
        String str3 = "Java";
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        
        System.out.println(str1.equals(str2));
        
    }
    
}
