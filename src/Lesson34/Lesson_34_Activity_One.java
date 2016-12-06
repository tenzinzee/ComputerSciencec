/*
 * Lesson 34 Coding Activity 1
 * 
 * For the Lesson 34 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods, 
 * then paste everything into the code runner box. Your submission should 
 * begin with the first import statement and end with the final }.
 * 
 * Write a method that takes an array of ints as a parameter and 
 * returns the sum of integers in the array.
 * 
 *     public static int sum(int [] a)
 * 
 * For example, sum(a); would return 6 if a = {1, 2, 3} or 3 if a = {1, 1, 1}.
 */


import java.util.Scanner;

class Lesson_34_Activity_One {
  
   public static int sum(int [] a)
    {
        int x = 0;
        for (int b: a) {
            x += b;
        }
    //Write your code here
    //Change the return value as you see fit
        return x;
    }
  
    public static void main(String[] args)
     {
     /*
      * Test your method here
      */
    }
}