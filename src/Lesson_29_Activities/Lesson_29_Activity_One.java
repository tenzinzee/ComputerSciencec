/*
 * Lesson 29 Coding Activity 1
 * A student wants an algorithm to find the hardest spelling
 * word in a list of vocabulary. They define hardest by the longest word.
 * Write the code to find the longest word stored in an array of Strings called list.
 * If several words have the same length it should print the first word 
 * in list with the longest length.
 * For example, if the following list were declared:
 * 
 *     String list [] = {"high", "every", "nearing", "checking", "food ", 
 *     "stand", "value",  "best", "energy", "add", "grand", "notation",
 *     "abducted", "food ", "stand"};
 * 
 * It would print:
 *     checking 
 */ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_29_Activity_One {
  
  /* Fill this list with values that will be useful for you to test. 
   * A good idea may be to copy/paste the list in the example above. 
   * Do not make any changes to this list in your main method. You can 
   * print values from list, but do not add or remove values to this 
   * variable. 
   */
  public static String [] list = {"high", "every", "nearing", "checking", "food ", "stand", "value",  "best", "energy", "add", "grand", "notation", "abducted", "food ", "stand"};
  
    public static void main(String[] args)
     {
         int li = 0;
         int ll = list[0].length();
         for (int i = 1; i< list.length; i++){
             if (list[i].length() > ll){
                 ll = list[i].length();
                 li = i;
             }
         }
         System.out.print(list[li]);
}
}