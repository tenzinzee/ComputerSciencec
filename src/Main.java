import java.util.Scanner;
import java.util.ArrayList;
//replace the class name main into Main
class Main {
    public static void main(String[] args) {
        ArrayList<String> stuff = new ArrayList<String>();
        stuff.add("Z");
        stuff.add("f");
        stuff.add(2, "W");
        stuff.remove(1);
        stuff.add("x");
        System.out.println(stuff);
    }
}