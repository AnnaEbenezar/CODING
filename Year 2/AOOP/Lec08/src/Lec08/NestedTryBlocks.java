/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec08;

/**
 *
 * @author HP
 */
class NestedTryBlocks {

    public static void main(String args[]) {
        int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};
        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + "/" + denom[i] + "is" + numer[i] / denom[i]);
            } catch (ArithmeticException exc) {
                System.out.println(" cannot divide by zero");
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println(" No matching element found");
            }
        }
    }
}
