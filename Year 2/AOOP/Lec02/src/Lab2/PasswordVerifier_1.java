///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Lab2;
//
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
///**
// *
// * @author HP
// */
//public class PasswordVerifier_1 {
//
//    final static int MINIMUM_PASSWORD_LENGTH = 6;
//    
//    static public boolean isMinLength(String password){
//        return password.length() >= PasswordVerifier_1.MINIMUM_PASSWORD_LENGTH;
//    }
//    
//    public static boolean hasUpperCase(String password){
//        return !password.equals(password.toLowerCase());
//    }
//    
//    public static boolean hasLowerCase(String password){
//        return !password.equals(password.toUpperCase());
//    }
//    
//    public static boolean hasDigit(String password){
//        return password.matches(".*\\d+.*");
//    }
//    
//    public static boolean hasLegalChars(String password){
//        Pattern pattern = Pattern.compile("[a-zA-Z0-9_]*");
//        Matcher matcher = pattern.matcher(password);
//        return matcher.matches();
//    }
//    
//    public static boolean isValid(){
//        return isMinimumLength(String password) &&
//        hasUpperCase(String password);
//    }
//}
