import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String w = "Rapunzel";
        for (int i = 0; i < w.length(); i++) {
            if ( i%4 != 2)
                System.out.print(w.charAt(i) + " ");
        }
    }
}

