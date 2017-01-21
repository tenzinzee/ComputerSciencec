import java.util.Scanner;
import java.util.ArrayList;
//replace the class name main into Main
class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add ("cookies");
        list.add ("nachos");
        list.add ("chips");
        list.add ("trail mix");
        list.add ("celery");


        for (String s: list)
            if (s.length() > 4 && s.length() < 6)
                System.out.print(s.toUpperCase() +" ");
    }
    public static void removeItem(ArrayList<String> li, String remove) {
        for (String s: li)
            if (s.equals(remove))
                li.remove(s);
    }
}