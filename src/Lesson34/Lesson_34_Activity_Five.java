/*
 * Lesson 34 Coding Activity 5
 * 
 * For the Lesson 34 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods, 
 * then paste everything into the code runner box. Your submission should 
 * begin with the first import statement and end with the final }.
 *  
 * Write a method that takes an array of ints
 * and returns a sum of only the even values.
 * 
 *     public static int sumEven(int [] a)
 * 
 * For example, sumEven(a) would return 6 if a = {1, 2, 3, 4, 5}.
 */


import java.util.Scanner;

class Lesson_34_Activity_Five {
  
   public static int sumEven(int [] a)
    {
        int x = 0;
        for(int b:a){
            if(b%2==0){
                x+=b;
            }
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