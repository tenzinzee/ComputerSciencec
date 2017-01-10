package Term2.Lesson2;

import java.util.ArrayList;
import java.util.Scanner;

//revise the class name Lesson2 into Main
class Lesson2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String temp = " ";
        ArrayList <String> array = new <String> ArrayList();

        System.out.println("Please enter words, enter STOP to stop the loop.");
        temp = s.nextLine();

        while (!temp.equals("STOP")){
            if (!(temp == " ")){
                add(temp,array);
            }


            temp = s.nextLine();
        }

        for(String a: array) {
            if(a.indexOf('a')!=-1)
            System.out.println(a);
        }

    }
    public static void add(String a, ArrayList array){
        array.add(a);
    }
}