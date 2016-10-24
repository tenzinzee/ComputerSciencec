/*
 * Lesson 17 Coding Activity 2
 * Ask the user for two numbers. Print only the even numbers between them,
 * you should also print the two numbers if they are even.
 * 
 *     Sample Run 1:
 *         
 *         Enter two numbers:
 *         3
 *         11
 *         
 *         4 6 8 10 
 * 
 *    Sample Run 2:
 *         
 *         Enter two numbers:
 *         10
 *         44
 *         
 *         10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44         
 * 
 * 
 */ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_17_Activity_Two {
    public static void main(String[] args)
     {
         int a = 0;
         int b = 0;
         int temp = 0;

         Scanner s = new Scanner(System.in);
         System.out.println("Enter two numbers");
         a = s.nextInt();
         b = s.nextInt();

         temp = a;

         while (temp != b+1) {
             if (temp % 2 == 0) {
                 System.out.print(temp + " ");
             }
             temp++;
         }

/*
 * Write your code here
 * Copy and paste your entire program to Code Runner
 * to complete the activity, from the first import statement
 * to the last bracket.
 */
}
}