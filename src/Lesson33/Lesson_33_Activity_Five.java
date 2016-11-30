/*
 * Lesson 33 Coding Activity 5
 * 
 * For the Lesson 33 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods, 
 * then paste everything into the code runner box. Your submission should 
 * begin with the first import statement and end with the final }.
 * 
 * For questions 2-5, you may want to start with the printIt method 
 * and use it to test the other three.
 *  
 * Write a method that takes an array of ints, an integer value, 
 * and an integer index.The method should insert the value at the given
 * index and move the values afterwards by one.
 * 
 * This method must be called insertValue() and must have the following 
 * parameter types: int[], integer, integer. 
 * 
 * Calling insertValue(a, 100, 2) would change the array {1, 2, 3, 4, 5} 
 * to {1, 2, 100, 3, 4}.
 */


import java.util.Arrays;
import java.util.Scanner;

class Lesson_33_Activity_Five {

    public static int[] insertValue(int[] a, int val, int index){

        int[] temp1 = a;
        int[] temp2 = a;
        temp1 = Arrays.copyOfRange(a, 0, index + 1);
        temp1[index] = val;
        temp2 = Arrays.copyOfRange(a,index, a.length - 1);


        System.arraycopy(temp1, 0, a, 0, temp1.length);
        System.arraycopy(temp2, 0, a, temp1.length, temp2.length);


        for (int i = 0; i < temp1.length; i++) {
            System.out.print(temp1[i] + " ");
        }
        for (int i = 0; i < temp2.length; i++) {
            System.out.print(temp2[i] + " ");
        }
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }

        return a;
    }

  
    public static void main(String[] args)
     {

         int[] a = {1,2,3,4,5,6};
         insertValue(a, 100, 2);



     /*
      * Test your method here
      */
    }
}