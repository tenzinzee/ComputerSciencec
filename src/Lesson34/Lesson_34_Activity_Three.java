/*
 * Lesson 34 Coding Activity 3
 * 
 * For the Lesson 34 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods, 
 * then paste everything into the code runner box. Your submission should 
 * begin with the first import statement and end with the final }.
 * 
 * Write a method that takes an array of ints and returns 
 * the largest value in the array.
 * 
 *     public static int findMax(int [] a)
 * 
 */


import java.util.Scanner;

class Lesson_34_Activity_Three {
  
   public static int findMax(int [] a)
    {
        int max = -9999999;
        for(int b:a){
            if(b>max){
                max = b;
            }
        }
    //Write your code here
    //Change the return value as you see fit
     return max;
    }
  
    public static void main(String[] args)
     {
     /*
      * Test your method here
      */
    }
}