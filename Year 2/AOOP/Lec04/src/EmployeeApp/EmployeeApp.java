/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EmployeeApp;

/**
 *
 * @author HP
 */
public class EmployeeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee emp, emp1;
        emp1 = new Employee("name2", null);
        emp = new Employee("name1", emp1);
        if (emp.supervisor == null) {
            System.out.println(emp.name + " is the boss!");
        } 
        else { 
            System.out.println("The supervisor of " + emp.name + " is " + emp.supervisor.name);
        }

        }

    }
