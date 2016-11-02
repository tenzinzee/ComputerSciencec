package Assignment5;

import java.util.Scanner;

//将 Assignment5 更改为 Main 即可

public class Assignment5 {
        public static void main(String[] args) {
            String input;
            String replace;
            Scanner s = new Scanner(System.in);

            System.out.println("Enter the first String:");
            input = s.nextLine();
            System.out.println("Enter the replacement String:");
            replace = s.nextLine();

            if (!input.matches("^[a-zA-Z%\\s\\t]*$")) {
                System.out.println("Error: Incorrect characters");
            } else if (input.indexOf("%") == -1) {
                System.out.println("Error: no %");
            } else {
                System.out.println(input.replaceFirst("%", replace));
            }
        }
    }
