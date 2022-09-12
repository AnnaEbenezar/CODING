/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueueLab;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

/**
 *
 * @author HP
 */
public class RPNCalculator {

    private static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        return pattern.matcher(str).matches();
    }

    public static void main(String[] args) {
        MyStackA stack = new MyStackA();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringTokenizer st = new StringTokenizer(input);
        while (st.hasMoreTokens()){
            String token = st.nextToken();
            if(isNumeric(token)){
                stack.push(Double.parseDouble(token));
            }
            else{
                switch (token) {
                    case "+" -> {
                        double b = stack.pop();
                        double a = stack.pop();
                        stack.push(a + b);
                    }
                    case "-" -> {
                        double b = stack.pop();
                        double a = stack.pop();
                        stack.push(a - b);
                    }
                    case "*" -> {
                        double b = stack.pop();
                        double a = stack.pop();
                        stack.push(a * b);
                    }
                    case "/" -> {
                        double b = stack.pop();
                        double a = stack.pop();
                        stack.push(a / b);
                    }
                }
            }
        }
        System.out.println(stack.pop());
        sc.close();
    }
}
