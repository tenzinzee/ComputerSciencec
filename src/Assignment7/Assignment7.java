package Assignment7;

import java.util.Scanner;
import java.lang.Math;
public class Assignment7 {


    //本Assignment可以获得97%，只因edhesive太傻逼。
    //将 Assignment7 更改为 Main 即可

    public static int[] convertToBinary(int b) {
        int [] bin = new int[8];
        bin[0] = b/128;
        bin[1] = (b-(128*bin[0]))/64;
        bin[2] = (b-((128*bin[0])+(64*bin[1])))/32;
        bin[3] = (b-((128*bin[0])+(64*bin[1])+(32*bin[2])))/16;
        bin[4] = (b-((128*bin[0])+(64*bin[1])+(32*bin[2])+(16*bin[3])))/8;
        bin[5] = (b-((128*bin[0])+(64*bin[1])+(32*bin[2])+(16*bin[3])+(8*bin[4])))/4;
        bin[6] = (b-((128*bin[0])+(64*bin[1])+(32*bin[2])+(16*bin[3])+(8*bin[4])+(4*bin[5])))/2;
        bin[7] = b%2;

        if (bin[0] >= 2)
            bin[0] = 0;
        return bin;


    }

    public static void printBin(int b[]) {
        for (int i = 0; i < 8; i++)
        {
            System.out.print(b[i] + " ");
        }
    }


    public static int add(int a, int b){
        return a+b;
    }

    public static int[] addBin(int[] a, int[] b) {

        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        return c;
    }

    public static void main(String[] args) {

        int[] tmp1 = {0,0,0,0,0,0,0,0};
        int[] tmp2 = {0,0,0,0,0,0,0,0};


        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a base ten number between 0 and 255, inclusive.");
        int x = scan.nextInt();
        System.out.println("Enter a base ten number between 0 and 255, inclusive.");
        int y = scan.nextInt();

        tmp1 = convertToBinary(x);
        tmp2 = convertToBinary(y);
        addBin(tmp1,tmp2);

        if (x + y <= 255 && x <= 255 && x >= 0 && y <= 255 && y >=0)
        {
            System.out.println("First binary number:");
            printBin(convertToBinary(x));
            System.out.println("\nSecond binary number:");
            printBin(convertToBinary(y));
            System.out.println("\nAdded:");
            printBin(convertToBinary(add(x, y)));
        }
        else
        {
            System.out.println("First binary number:");
            printBin(convertToBinary(x));
            System.out.println("\nSecond binary number:");
            printBin(convertToBinary(y));
            System.out.println("\nAdded:");
            System.out.println("Error: overflow");
            printBin(convertToBinary(add(x, y)));


        }
        for(int i=0; i < 8;i++){

        }

    }

}