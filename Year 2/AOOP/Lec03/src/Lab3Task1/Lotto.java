/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab3Task1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Lotto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        int[] winningLotto = {12, 35, 34, 2, 5};
        int[] userLotto = new int[5];
        int numberMatch = 0;
        
        Scanner input = new Scanner(System.in);
        
        for (int i=0; i<userLotto.length; i++) {
            System.out.println("Enter your lotto number " + (i+1) + " :");
            userLotto[i] = input.nextInt();
        }
        
        Arrays.sort(winningLotto);
        
        for (int num : userLotto) {
            numberMatch += (Arrays.binarySearch(winningLotto, num) < 0) ? 0 : 1;
        }
        
        System.out.println(numberMatch);
        System.out.println((numberMatch==0)?"0 matching numbers: $0"
                :((numberMatch==1)?"1 matching numbers: $1"
                        :((numberMatch==2)?"2 matching numbers: $50"
                                :((numberMatch==3)?"3 matching numbers: $10,000"
                                        :((numberMatch==4)?"4 matching numbers: $50,000"
                                                :"5 matching numbers: $90,000,000")))));
    }
}
    
