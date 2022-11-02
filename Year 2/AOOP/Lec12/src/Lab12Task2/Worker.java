/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab12Task2;

/**
 *
 * @author HP
 */
public class Worker implements Runnable {
    
    int [] [] A, B, product;
    int row, col;

    public Worker(int[][] A, int[][] B, int[][] product, int row, int col) {
        this.A = A;
        this.B = B;
        this.product = product;
        this.row = row;
        this.col = col;
    }

    @Override
    public void run() {
        product [row][col] = A[row][0] * B[0][col] + A[row][1] * B[1][col];
    }
    
}
