/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AVLvsSplay_Lab;

import java.util.Random;

/**
 *
 * @author HP
 */
public class AVLvsSplay {

    static int nextGaussian(Random r, int mean) {
        return (int) (r.nextGaussian() * mean / 2) + mean;
    }

    public static void main(String[] args) {
        int start = 100000; // change to fit your machine
        int step = 100000; // change to fit your machine

        Random r = new Random();

        // AVL Tree, ordered build
        for (int n = start; n < start + 10 * step; n += step) {
            AVL_Tree avl = new AVL_Tree();
            System.out.println("n: " + n);
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                avl.add(i);
            }
            System.out.println("avl ordered build: " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                avl.search(i);
            }
            System.out.println("avl ordered access: " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                avl.search(nextGaussian(r, n));
            }
            System.out.println("avl gaussian access: " + (System.currentTimeMillis() - startTime));
            System.out.println();
        }

        // AVL Tree, random bild
        for (int n = start; n < start + 10 * step; n += step) {
            AVL_Tree avl = new AVL_Tree();
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                avl.add(r.nextInt(n));
            }
            System.out.println("avl random build: " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                avl.search(i);
            }
            System.out.println("avl ordered access: " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                avl.search(nextGaussian(r, n));
            }
            System.out.println("avl gaussian access: " + (System.currentTimeMillis() - startTime));
            System.out.println();
        }

        System.out.println("SplayTree");
        // SPL Tree, ordered build
        for (int n = start; n < start + 10 * step; n += step) {
            Splay_Tree spl = new Splay_Tree();
            System.out.println("n: " + n);
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                spl.add(i);
            }
            System.out.println("spl ordered build: " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                spl.search(i);
            }
            System.out.println("spl ordered access: " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                spl.search(nextGaussian(r, n));
            }
            System.out.println("spl gaussian access: " + (System.currentTimeMillis() - startTime));
            System.out.println();
        }

        // SPL Tree, random bild
        for (int n = start; n < start + 10 * step; n += step) {
            Splay_Tree spl = new Splay_Tree();
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                spl.add(r.nextInt(n));
            }
            System.out.println("spl random build: " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                spl.search(i);
            }
            System.out.println("spl ordered access: " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                spl.search(nextGaussian(r, n));
            }
            System.out.println("spl gaussian access: " + (System.currentTimeMillis() - startTime));
            System.out.println();
        }

    }
}
