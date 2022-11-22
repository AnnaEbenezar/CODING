/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DijkstraLab;

/**
 *
 * @author HP
 */
public class Solution {

    static int minStep(int n) {
        int temp = n;
        int counter = 0;

        while (temp > 1) {
            if (temp % 3 == 0) {
                temp /= 3;
                counter++;
            } else {
                temp -= 1;
                counter++;
            }
        }
        return counter;
    }
}
