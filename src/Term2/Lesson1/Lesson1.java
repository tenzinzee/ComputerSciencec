/*
 * Lesson 2 Coding Activity Question 3
 * 
 * Write the code to output:

   _
 /   \
|     |
 \ _ /
	
 * It may be easier to get the correct output 
 * if you copy/paste each line from the sample run above.
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String temp = " ";
        ArrayList array = new ArrayList();

        System.out.println("Please enter words, enter STOP to stop the loop.");
        temp = s.nextLine();

        while (!temp.equals("STOP")){
            if (!(temp == " ")){
                add(temp,array);
            }


            temp = s.nextLine();
        }

        System.out.println(array.size());
        System.out.println(array);
        if (array.size() >2){
            array.remove(array.size()-1);
            array.remove(0);
        }

        System.out.println(array);









    }
    public static void add(String a, ArrayList array){
        array.add(a);
    }
}