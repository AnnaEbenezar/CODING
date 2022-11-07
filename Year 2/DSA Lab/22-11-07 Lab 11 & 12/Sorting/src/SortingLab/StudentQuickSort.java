/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortingLab;

/**
 *
 * @author HP
 */
public class StudentQuickSort {

    static void quickSort(int keys[], int begin, int end) {
        int partitionIndex;
        while (begin < end) {
            partitionIndex = partition(keys, begin, end);
            quickSort(keys, begin, partitionIndex - 1);
            begin = partitionIndex + 1;
        }
    }

    static int partition(int keys[], int begin, int end) {
        int pIndex = begin;
        int pivot = keys[end];

        for (int i = begin; i < end; i++) {
            if (keys[i] <= pivot) {
                swap(keys, i, pIndex++);
            }
        }

        swap(keys, pIndex, end);

        return pIndex;
    }

    // you may add any method(s) as you see fit
    static void sort(int keys[]) {
        quickSort(keys, 0, keys.length - 1);
    }
    
    static void swap(int keys[], int i, int j) {
        int swapTemp = keys[i];
        keys[i] = keys[j];
        keys[j] = swapTemp;
    }
}
