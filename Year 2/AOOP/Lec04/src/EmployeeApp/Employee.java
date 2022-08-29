/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeApp;

/**
 *
 * @author HP
 */
public class Employee {
    // An object of type Employee holds data about one employee. 

    String name; // Name of the employee. 
    Employee supervisor; // The employee's supervisor. 

    Employee(String name, Employee supervisor) {
        this.name = name;
        this.supervisor = supervisor;
    }
// other methods 

}
