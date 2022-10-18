/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package BST_Lab;

/**
 *
 * @author HP
 */
public class BST_Test {

    public static void main(String[] args) {
        int N;
        N = Integer.parseInt(args[0]);
        int M = N;
        for (int j = 0; j < 10; j++) {
            BinarySearchTree bst = new BinarySearchTree();

            System.out.println("First Set of Data Round: " + j);
            long starttime = System.currentTimeMillis();

            for (int i = 0; i < N; i++) {
                bst.insert(i, bst.root);
            }

            long endtime = System.currentTimeMillis();
            System.out.println("Inserting " + N + " datas took " + (endtime - starttime) + " milliseconds");

            BinarySearchTree bst2 = new BinarySearchTree();

            System.out.println("Second Set of Data Round: " + j);
            starttime = System.currentTimeMillis();

            for (int i = 0; i < N; i++) {
                bst2.insert((int) (N * Math.random()), bst2.root);
            }

            endtime = System.currentTimeMillis();
            System.out.println("Inserting " + N + " data took " + (endtime - starttime) + " milliseconds");

            N += M;
        }
    }
}
