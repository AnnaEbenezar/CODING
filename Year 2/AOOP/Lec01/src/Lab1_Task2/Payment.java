/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_Task2;

/**
 *
 * @author ICKMITL-Student
 */
public class Payment {
    
    
    static String getPayment(double basePay, int hoursWorked){
        String payStr = "";
        if (basePay < 8.0) {
            payStr = "Base Pay must be >= 8.00";       
                   
        }
        else if (hoursWorked >= 60.0 ) {
            payStr = "Hours Worked must be <= 60";
        }
        
        else payStr = "" + (basePay * Math.min(hoursWorked, 40)+ (1.5 * basePay * Math.max(0, (hoursWorked - 40))));
        return payStr;
    } 
}
