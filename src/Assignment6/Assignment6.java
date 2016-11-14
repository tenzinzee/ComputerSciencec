package Assignment6;

/**
 * Created by walterhuang on 11/14/16.
 */
import java.util.*;

//将 Assignment6 更改为 Main 即可

public class Assignment6 {


    public static void main(String[] args) {

        Integer Array1[] = new Integer[10000];
        Scanner s = new Scanner(System.in);
        Integer input1;
        int count = 0;
        System.out.println("Enter the values for the first array, up to 10000 values, enter zero or a negative number to quit");
        while (true) {
            input1 = s.nextInt();
            if (input1 <= 0) break;

            Array1[count] = input1;
            count++;
        }
        Array1 = Arrays.copyOfRange(Array1, 0, Arrays.asList(Array1).indexOf(null));


        Integer Array2[] = new Integer[10000];
        count = 0;
        Integer input2;
        System.out.println("Enter the values for the second array, up to 10000 values, enter zero or a negative number to quit");

        while (true) {
            input2 = s.nextInt();
            if (input2 <= 0) break;

            Array2[count] = input2;
            count++;
        }
        Array2 = Arrays.copyOfRange(Array2, 0, Arrays.asList(Array2).indexOf(null));



        System.out.println();
        System.out.println("First Array: ");
        for (Integer i: Array1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Second Array: ");
        for (Integer i: Array2) {
            System.out.print(i + " ");
        }


        if (test(Array1) && test(Array2)){
            Integer[] Array = new Integer[Array1.length + Array2.length];
            System.arraycopy(Array1, 0, Array,0, Array1.length);
            System.arraycopy(Array2, 0, Array, Array1.length, Array2.length);
            Arrays.sort(Array);
            System.out.println();
            System.out.println("Merged Array:");
            for (Integer i:Array){
                System.out.print(i.toString() + " ");
            }
        }else {
            System.out.println("ERROR: Array not in correct order");
        }

    }
    public static boolean test(Integer[] array){
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
