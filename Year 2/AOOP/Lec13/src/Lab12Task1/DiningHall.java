/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab12Task1;

/**
 *
 * @author HP
 */
public class DiningHall {

    static int pizzaNum;
    static int studentID;

    public void makePizza() {
        pizzaNum++;
    }
    
    static Object lockObj = new Object();
    
    static class PizzaServed extends Thread {      
        
        @Override
        public void run() {
            String result;
            if (pizzaNum > 0) {
                result = "Served";
            } else {
                result = "Starved";
            }
            synchronized (lockObj)  {
                System.out.println(result + studentID);
                studentID++;
            }
        }       
    }
/*
    public void servePizza() {
        String result;
        if (pizzaNum > 0) {
            result = "Served ";
            pizzaNum--;
        } else {
            result = "Starved ";
        }
        System.out.println(result + studentID);
        studentID++;
    }
*/
    public static void main(String[] args) {
        DiningHall d = new DiningHall();
        for (int i = 0; i < 10; i++) {
            d.makePizza();
        }
        for (int i = 0; i < 20; i++) {
            new PizzaServed().start();
            //d.servePizza();
        }
    }
}
