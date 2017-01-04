/*
 * Lesson 17 Coding Activity 1
 * Write a program that will input a list of test scores in from the keyboard. 
 * When the user enters -1, print the average.
 * 
 * What do you need to be careful about when using -1 to stop a loop?
 * 
 *     Sample Run:
 *         Enter the Scores:
 *         45
 *         100
 *         -1
 *
 *         The average is: 72.5
 * 
 * 
 */ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_17_Activity_One {
    public static void main(String[] args)
     {

         int temp = 0;
         int total = 0;
         int times = -1;
         Scanner s = new Scanner(System.in);

         while (temp != -1){
             System.out.println("Enter the Scores");
             temp = s.nextInt();
             total += temp;
             times ++;


         }

         System.out.println("The average is: " + ((double)(total + 1)/times));

/*
 * Write your code here
 * Copy and paste your entire program to Code Runner
 * to complete the activity, from the first import statement
 * to the last bracket.
 */
}
}