/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PPT36;

/**
 *
 * @author HP
 */
public class HeapQuizTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 0;
        HeapQuiz[] hq = new HeapQuiz[5];
        while (x < 3) {
            hq[x] = new HeapQuiz();
            hq[x].id = x;
            x = x + 1;
        }

        for (int j = 0; j < hq.length; j++) {
            System.out.println(hq[j]);
        }    }
    
}
