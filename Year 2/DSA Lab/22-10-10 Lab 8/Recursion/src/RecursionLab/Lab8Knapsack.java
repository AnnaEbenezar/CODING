/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RecursionLab;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Lab8Knapsack {
    public static int ans = 0;
    public static ArrayList<Integer> idxList = new ArrayList<Integer>();

    public static void main(String[] args) {
        
        int [] weight = {1, 2, 3, 8, 7, 4};
        int [] values = {20, 5, 10, 50, 40, 25};
        int w = 10;
        
        ArrayList<Integer> currList = new ArrayList<Integer>();
        int minIdx = 0, maxIdx = 0;
        
        for (int i = 0; i <values.length; i++) {
            if (weight[i] < weight[minIdx]) {
                minIdx = i;
            }
            
            if (weight[i] > weight[maxIdx]) {
                maxIdx = i;
            }
        }
        
        //excluding the minimum weight
        knapsack(weight, values, w, 0, 0, 0, currList, minIdx);
        //excluding the maximum weight
        knapsack(weight, values, w, 0, 0, 0, currList, maxIdx);   
        
        System.out.println("The Knapsack value is " + ans);
        
        System.out.println("Index: " + printList(idxList));
        
        System.out.print("Value: ");
        
        for (Integer i : idxList) {
            System.out.print(values[i] + ", ");
        }

        System.out.println();
        
        System.out.print("Weight: ");
        for (Integer i : idxList) {
            System.out.print(weight[i] + ". ");
        }

        System.out.println();
    }
    
    public static void knapsack(int [] W, int [] values, int w, int i, int currW, 
            int currVal, ArrayList<Integer> currList, int excludeIdx) {
        
        //List % 2 because it needs to be an even number
        if (currVal > ans && currList.size() % 2 == 0) {
            ans = currVal;
            idxList.clear();
            idxList.addAll(currList);
        }
        
        if (i == values.length) return;
        
        if (currW + W[i] <= w && i != excludeIdx) {
            currList.add(i);
            knapsack(W, values, w, i + 1, currW + W[i], currVal + values[i], 
                    currList, excludeIdx);
            currList.remove(currList.size() - 1);
            knapsack(W, values, w, i + 1, currW, currVal, currList, excludeIdx);
        } else {
            knapsack(W, values, w, i + 1, currW, currVal, currList, excludeIdx);
        }
    }
    
    public static String printList(ArrayList<Integer> l) {
        
        StringBuilder s = new StringBuilder();
        
        for (Integer i : l) {
            s.append(i).append(" ");
        }

        return s.toString();
    }

//    static void knapsack() {
//        int[] values = {60, 100, 120};
//        int[] weights = {10, 20, 30};
//        int W = 60;
//        basicKnapsack(W, weights, values, values.length);
//        IsPicked dummy = new 
//    }
//
//    static int basicKnapsack(int W, int[] w, int[] v, int n) {
//        
//        if (n == 0 || W == 0) {
//            return 0;
//        }
//        //insert code//
//        int notPicked = basicKnapsack(W, w, v, n - 1);
//        
//        int picked = v[n - 1] + basicKnapsack(W - w[n - 1], w, v, n - 1);
//        System.out.println("this case is" + picked);
//        return Math.max(notPicked, picked);
//    }
//    
//    class ItemTracker {
//        boolean [] isPicked;
//        ItemTracker(int n) {
//            isPicked - new boolean;
//        }
//    }

}
