/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab12Task2;

import java.util.Arrays;

/**
 *
 * @author HP
 */
public class MatrixMultwithThread {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        int [][] A = {{1,0}, {3,-2}, {1,4}};
        int [][] B = {{1,0,3}, {-2,1,4}};
        
        int [][] product = new int[A.length][B[0].length];
        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                Thread t = new Thread(new Worker(A,B, product, 0,0));
                t.start();
                t.join();
            }
        }
        System.out.println(Arrays.deepToString(product));        
    }    
}
