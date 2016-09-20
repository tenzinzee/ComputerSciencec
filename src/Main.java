import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter the Amount Paid:");
        double a = s.nextDouble();
        System.out.println("Please Enter the Cost of the Item:");
        double b = s.nextDouble();
        double c = ((double) (((int) Math.round(a * 100)) - ((int) Math.round(b * 100)))/100);
        System.out.println("Change Owed: "+c);
        int q = (int) Math.round(c*100) / 25;
        c = (double) (((int) Math.round(c*100) - (q*25)))/100;
        int d = (int) Math.round(c*100) / 10;
        c = (double) (((int) Math.round(c*100) - (d*10)))/100;
        int n = (int) Math.round(c*100) / 5;
        c = (double) (((int) Math.round(c*100) - (n*5)))/100;
        int p = (int) Math.round(c*100);
        c = (double) (((int) Math.round(c*100) - (p)))/100;
        System.out.println("Pennies: " + p);
        System.out.println("Nickels: " + n);
        System.out.println("Dimes: " + d);
        System.out.println("Quarters: " + q);


    }
}
