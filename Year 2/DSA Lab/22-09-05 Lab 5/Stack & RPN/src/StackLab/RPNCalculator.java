/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StackLab;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author HP
 */
public class RPNCalculator {
    public static void main(String[] args) {
        MyStackA stack = new MyStackA();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringTokenizer st = new StringTokenizer(input);
        while (st.hasMoreTokens()){
            String token = st.nextToken();
            if(token.matches(".*[0-9].*")){ //for copiers, one can use the Pattern class to compile the regex and use the matcher class to match the string
                stack.push(Double.parseDouble(token));
            }
            else{
                if(token.equals("+")){
                    double b = stack.pop();
                    double a = stack.pop();
                    stack.push(a+b);
                }
                else if(token.equals("-")){
                    double b = stack.pop();
                    double a = stack.pop();
                    stack.push(a-b);
                }
                else if(token.equals("*")){
                    double b = stack.pop();
                    double a = stack.pop();
                    stack.push(a*b);
                }
                else if(token.equals("/")){
                    double b = stack.pop();
                    double a = stack.pop();
                    stack.push(a/b);
                }
            }
        }
        System.out.println(stack.pop());
        sc.close();
    }
}
