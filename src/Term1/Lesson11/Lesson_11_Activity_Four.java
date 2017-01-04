/*
 * Lesson 11 Coding Activity 4
 * Test if an integer input from the keyboard is odd or even.
 * 
 *     Sample Run 1:
 *        Enter a Number:
 *        78
 *        Even
 * 
 *     Sample Run 2:
 *        Enter a Number:
 *        17
 *        Odd
 * 
 */

import java.util.Scanner;
import java.lang.Math;


class Lesson_11_Activity_Four {   
public static void main(String[] args) 
   {
       Scanner scan = new Scanner(System.in);
       int temp;

       temp = scan.nextInt();
       if (temp % 2 == 0)
           System.out.print("Even");
       else
           System.out.print("Odd");



   /* Write your code here 
    * Copy and paste your entire program to Code Runner to complete the activity, 
    * from the first import statement to the last bracket. 
    */
    }
}