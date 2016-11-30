package Lesson1011;
/*
 * Lesson 1011 Coding Activity 
 * 
 * For this program you will input an int to represent the octal number 
 * and translate to the base ten number. The octal number must be 8 digits or less.
 * 
 * Your program should also check that all the digits are 0 - 7, then translate the 
 * number to base ten. 
 * 
 * Sample Run 1: 
 * Enter a number in base 8: 
 * 1287 
 * ERROR: Incorrect Octal Format 
 * 
 * Sample Run 2: 
 * Enter a number in base 8: 
 * 123 
 * 83 
 * 
 * Sample Run 3: 
 * Enter a number in base 8: 
 * 1111111111 
 * ERROR: Incorrect Octal Format
 *   
 */ 

import java.util.Scanner;
import java.lang.Math;
import java.math.*;

class Lesson_1011_Activity{
    public static void main(String[] args)
     {
         int output = 0;
         Integer input = 0;
         String temp;
         Scanner s = new Scanner(System.in);

         System.out.println("Enter a number in base 8: ");

         input = s.nextInt();
         temp = input.toString();

         if (temp.length() <= 8 && temp.matches("^[0-7]*$")) {

             for (int i = temp.length(); i > 0; i--) {
                 output += Integer.parseInt(temp.substring(i - 1, i)) * (Math.pow (8, temp.length() - i));
             }
             System.out.println(output);
         }else{
             System.out.println("ERROR: Incorrect Octal Format");
         }






/*
 * Write your code here
 * Copy and paste your entire program to Code Runner
 * to complete the activity, from the first import statement
 * to the last bracket.
 */
}
}