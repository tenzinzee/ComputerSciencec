/*
 * Lesson 13 Coding Activity 4
 * Input an integer grade from the keyboard and translate it to a letter grade. 
 * For example, if a user enters 4, print "A", and if they enter 0 print "F." 
 * You can assume that an integer between 0 and 4 will be input.
 */


import java.util.Scanner;

class Lesson_13_Activity_Four {
    public static void main(String[] args)
     {
         Scanner scan = new Scanner(System.in);
         int temp;

         temp = scan.nextInt();
         if (temp == 4){
             System.out.print("A");
         }else if(temp == 3){
             System.out.print("B");
         }else if(temp == 2) {
             System.out.print("C");
         }else if(temp == 1) {
             System.out.print("D");
         }else{
             System.out.print("F");
         }
     /*
      * Write your code here
      * Copy and paste your entire program to Code Runner
      * to complete the activity, from the first import statement
      * to the last bracket.
      */
    }
}