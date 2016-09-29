/*
 * Lesson 13 Coding Activity 3 
 * Input two integers and print the largest. If they are equal print "EQUAL". 
 * You should be able to do this with only one if statement but you may use multiple else statements.
 */


import java.net.SecureCacheResponse;
import java.util.Scanner;

class Lesson_13_Activity_Three {
    public static void main(String[] args)
     {
         Scanner scan = new Scanner(System.in);
         int a;
         int b;

         a = scan.nextInt();
         b = scan.nextInt();
         if(a > b){
             System.out.print(a);
         }else if (a < b){
             System.out.print(b);
         }else{
             System.out.print("EQUAL");
         }
     /*
      * Write your code here
      * Copy and paste your entire program to Code Runner
      * to complete the activity, from the first import statement
      * to the last bracket.
      */
    }
}