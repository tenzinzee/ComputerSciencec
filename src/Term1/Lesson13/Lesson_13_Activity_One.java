/*
 * Lesson 13 Coding Activity 1 
 * Take input of an integer number from the keyboard 
 * and print "Positive" if it's positive or zero, and print "Negative" otherwise.
 */


import java.util.Scanner;

class Lesson_13_Activity_One {
    public static void main(String[] args)
     {
         Scanner scan = new Scanner(System.in);
         int temp;

         temp = scan.nextInt();
         if(temp >= 0){
             System.out.print("Positive");
         }else{
             System.out.print("Negative");
         }
     /*
      * Write your code here
      * Copy and paste your entire program to Code Runner
      * to complete the activity, from the first import statement
      * to the last bracket.
      */
    }
}