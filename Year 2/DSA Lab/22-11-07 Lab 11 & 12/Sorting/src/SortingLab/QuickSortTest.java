/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SortingLab;

import java.util.Random;

/**
 *
 * @author HP
 */
public class QuickSortTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int N = 200000000;
        Random r = new Random(28253);

        int keys[] = new int[N];

        for (int i = 0; i < N; i++) {
            keys[i] = (int) (r.nextGaussian() * N / 2);
        }

        int keys2[] = keys.clone();

        long startTime = System.currentTimeMillis();
        TeacherQuickSort.sort(keys);
        long teacherTime = System.currentTimeMillis() - startTime;
        System.out.println("Teacher Sorting time: " + teacherTime);
        
        startTime = System.currentTimeMillis();
        StudentQuickSort.sort(keys2);
        long studentTime = System.currentTimeMillis() - startTime;
        System.out.println("Student Sorting time: " + studentTime);

        System.out.println("ratio is " + (teacherTime / (double) studentTime));

        startTime = System.currentTimeMillis();
        if (isDiffer(keys, keys2)) {
            System.out.println("Error: keys2 is not sorted!");
        } else {
            System.out.println("Sorting ok!");
        }
        System.out.println("Differ time: " + (System.currentTimeMillis() - startTime));
    }
    
    static void printArray(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    
    static boolean isDiffer(int arr1[], int arr2[]) {
        if (arr1.length != arr2.length) {
            return true;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return true;
            }
        }
        return false;
    }
    
}


