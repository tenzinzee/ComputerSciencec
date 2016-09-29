/*
 * Lesson 13 Coding Activity 5 
 * Create a program to let the user practice their multiplication tables.
 * Print two random integers between 1 and 12 each on a new line. 
 * Then, ask the user to input the multiplication of the two numbers. 
 * If they enter the correct product print "Correct!" otherwise print "Wrong".
 */


import java.util.Scanner;

class Lesson_13_Activity_Five {
    public static void main(String[] args)
     {
         Scanner scan = new Scanner(System.in);
         int a;
         int b;
         int answer;
         int input;

         a = (int)(1 + Math.random()*12);
         b = (int)(1 + Math.random()*12);
         answer = (a*b);

         System.out.println(a);
         System.out.println(b);
         input = scan.nextInt();
         if (input == answer){
             System.out.println("Correct!");
         }else{
             System.out.println("Wrong");
         }


     /*
      * Write your code here
      * Copy and paste your entire program to Code Runner
      * to complete the activity, from the first import statement
      * to the last bracket.
      */
    }
}