/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8Task2;

/**
 *
 * @author HP
 */
public class TesterException {

    public static void main(String args[]) {
        Slip firstSlip = null;
        try // force exception with invalid slip Id
        {
            firstSlip = new Slip(150, 10, 25);
            System.out.println(firstSlip);
        } catch (Exception n) // display exception message
        {
            System.out.println(n);
        }

        try // force exception with invalid width
        {
            firstSlip = new Slip(1, 15, 25);
            System.out.println(firstSlip);
        } catch (Exception n) // display exception message
        {
            System.out.println(n);
        } finally {
            System.out.println("finally block is always executed");
        }

        try // create a slip using valid id & width
        {
            firstSlip = new Slip(2, 10, 25);
            System.out.println(firstSlip);
        } catch (Exception n) {
            System.out.println(n);
        } finally {
            System.out.println("finally block is always executed");
        }
    }
}
