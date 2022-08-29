//package MyArrayLab;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class ArrayTester {

    public static void main(String args[]) {
        for (int i = 0; i < 5; i++) {
            for (int N = 10000000; N <= 100000000; N += 10000000) {
                long start = System.currentTimeMillis();
                MyArray mArray = new MyArray();
                for (int n = 1; n < N; n++) {
                    mArray.add((int) (Math.random() * 1000));
                }
                long time = (System.currentTimeMillis() - start);
                System.out.println(N + "\t" + time);
            }
            System.out.println(" ");
        }
    }
}
