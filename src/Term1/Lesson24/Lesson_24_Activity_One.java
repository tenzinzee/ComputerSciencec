/*
 * Lesson 24 Coding Activity 1
 * Use a for loop to print all of the numbers from 23 to 89, with 10 numbers on each line. 
 * Print one space between each number.
 */ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_24_Activity_One {
    public static void main(String[] args)
     {
         for (int i = 23; i <= 89; i++){
             if (i % 10 == 3){
                 System.out.print("\n" + i + " ");
             }else{
             System.out.print(i + " ");
             }
         }
/*
 * Write your code here
 * Copy and paste your entire program to Code Runner
 * to complete the activity, from the first import statement
 * to the last bracket.
 */
}
}