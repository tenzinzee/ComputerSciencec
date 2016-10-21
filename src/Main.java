import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        while (n < 20){
            System.out.println(n % 4 + " ");
            if (n%5 == 2)
            {
                n+=4;
            }
            else
            {
                n+=3;
            }
        }
    }
}
