
import java.util.Scanner;
import java.util.ArrayList;
//revise the class name main into Main
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