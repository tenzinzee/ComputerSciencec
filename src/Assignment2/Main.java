
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {

        double AmountPaid;
        double ItemCost;
        double ChangeAmount;
        int Pennies;
        int Nickels;
        int Dimes;
        int Quarters;
        int temp;

        Scanner s = new Scanner(System.in);

        System.out.println("Please Enter the Amount Paid: ");
        AmountPaid = s.nextDouble();

        System.out.println("Please Enter the Cost of the Item: ");
        ItemCost = s.nextDouble();

        temp = ((int) Math.round(AmountPaid * 100)) - ((int) Math.round(ItemCost * 100));
        ChangeAmount = (double)temp / 100;
        Quarters = temp / 25;
        temp = temp - (Quarters * 25);
        Dimes = temp / 10;
        temp = temp - (Dimes * 10);
        Nickels = temp / 5;
        temp =  temp - (Nickels * 5);
        Pennies = temp;


        System.out.println("Change Owed: " + ChangeAmount);
        System.out.println("Pennies: " + Pennies);
        System.out.println("Nickels: " + Nickels);
        System.out.println("Dimes: " + Dimes);
        System.out.println("Quarters: " + Quarters);

    }
}
