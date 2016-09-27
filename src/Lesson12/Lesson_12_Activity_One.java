/*
 * Lesson 12 Coding Activity 1 
 * Write a program to input three integers. 
 * Test if the average is greater than or equal to 89.5. 
 * If so, print out the phrase "ABOVE AVERAGE" (without the quotes).
 */


import java.util.Scanner;

class Lesson_12_Activity_One {
    public static void main(String[] args)
     {
         Scanner scan = new Scanner(System.in);
         int a;
         int b;
         int c;
         double avg;

         a = scan.nextInt();
         b = scan.nextInt();
         c = scan.nextInt();
         avg = (double)(a+b+c)/3;

         if (avg >= 89.5 ){
             System.out.print("ABOVE AVERAGE");
         }
     /*
      * Write your code here
      * Copy and paste your entire program to Code Runner
      * to complete the activity, from the first import statement
      * to the last bracket.
      */
    }
}