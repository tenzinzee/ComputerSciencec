/*
 * Lesson 34 Coding Activity 6
 * 
 * For the Lesson 34 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods, 
 * then paste everything into the code runner box. Your submission should 
 * begin with the first import statement and end with the final }.
 * 
 * Write a method that takes an array of ints and returns true if all 
 * of the values in the array are positive. If the array contains any
 * negative integers, it should return false.
 * 
 *     public static boolean allPositive(int [] a)
 * 
 */


import java.util.Scanner;

class Lesson_34_Activity_Six {
  
  public static boolean allPositive(int [] a)
    {

        for(int b:a){
            if (b<0)
                return false;
        }

    //Write your code here
    //Change the return value as you see fit
     return true;
    }
  
    public static void main(String[] args)
     {
     /*
      * Test your method here
      */
    }
}