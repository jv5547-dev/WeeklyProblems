package week9and10;

import javax.swing.plaf.PanelUI;
import java.util.Scanner;
//level 1
/*
Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
Hint =>
Take user input using the  Scanner next() method for 2 String variables
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String Built-In method to check if the results are the same and display the result
 */
public class Compare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();

        boolean customResult = compareStrings(str1, str2);
        boolean builtInResult = str1.equals(str2);

        System.out.println("Custom charAt() comparison: " + customResult);
        System.out.println("Built-in equals() comparison: " + builtInResult);
        System.out.println("Do results match? " + (customResult == builtInResult));
    }

    // Method to compare strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}