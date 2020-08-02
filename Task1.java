package com.lessons.lesson10.homeWork;

public class Task1 {

    public static void main(String[] args) {
        String value = "шалаш";
        String result = reverseString(value);
        System.out.println(isPalindrome(value,result));
    }

    public static String reverseString(String value){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            result.insert(0, value.charAt(i));
        }
        return result.toString();
    }

    public static boolean isPalindrome(String value, String result){
        return value.equals(result);

    }
}
