/*
 * Lesson 14 Coding Activity 2
 * Write a program to input two integers and print 
 * "Both are positive or zero." to the screen, if both are positive or zero.
 * Print "One or both are negative." otherwise.
 */


import java.util.Scanner;

class Lesson_14_Activity_Two {
    public static void main(String[] args)
     {
         Scanner scan = new Scanner(System.in);
         int temp1;
         int temp2;

         temp1 = scan.nextInt();
         temp2 = scan.nextInt();
         if (temp1 >= 0 && temp2 >=0 ){
             System.out.println("Both are positive or zero.");
         }else{
             System.out.println("One or both are negative.");
         }
     /*
      * Write your code here
      * Copy and paste your entire program to Code Runner
      * to complete the activity, from the first import statement
      * to the last bracket.
      */
    }
}