/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TestVars;

/**
 *
 * @author HP
 */
public class TestLateBinding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LB_1 lb1 = new LB_1();
        LB_2 lb2 = new LB_2();
        LB_1 lb3 = lb2;
        System.out.println(lb1.retValue(10));
        System.out.println(lb3.retValue(10));
        //System.out.println(lb3.retValue("Today")); //??
        System.out.println(((LB_2)lb3).retValue("Today")); //Correct Vers
        System.out.println(lb3.getValue1());
        //System.out.println(lb3.getValue2()); //??
        System.out.println(((LB_2)lb3).getValue2());
        System.out.println(lb3.j);
    }
    
}
