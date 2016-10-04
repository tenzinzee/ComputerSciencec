/*
 * Lesson 14 Coding Activity 3
 * The Internet runs on web addresses.The addresses we type represent the IP address 
 * for each site and how the computer finds an individual web page.
 *
 * IP addresses are made up of four numbers, each between 0 and 255 separated by a period. 
 * For example, 128.253.21.58 is an IP address.
 * 
 * Write a program to enter four numbers and test if they make up a valid IP address.
 * In other words, test to see if the numbers entered are between 0 and 255 inclusive.
 * 
 *     Sample Run 1
 *         Please enter the first octet:
 *         898
 *         Please enter the second octet:
 *         34
 *         Please enter the third octet:
 *         712
 *         Please enter the fourth octet:
 *         45
 *         Octet 1 is incorrect
 *         Octet 3 is incorrect
 * 
 *         
 *      Sample Run 2
 *         Please enter the first octet:
 *         112
 *         Please enter the second octet:
 *         200
 *         Please enter the third octet:
 *         0
 *         Please enter the fourth octet:
 *         254
 *         IP Address: 112.200.0.254
 * 
 */


import java.util.Scanner;

class Lesson_14_Activity_Three {
    public static void main(String[] args)
     {
         Scanner scan = new Scanner(System.in);
         int temp1;
         int temp2;
         int temp3;
         int temp4;

         System.out.println("Please enter the first octet:");
         temp1 = scan.nextInt();
         System.out.println("Please enter the second octet:");
         temp2 = scan.nextInt();
         System.out.println("Please enter the third octet:");
         temp3 = scan.nextInt();
         System.out.println("Please enter the fourth octet:");
         temp4 = scan.nextInt();

         if (temp1 > 255 || temp1 < 0) {
             System.out.println("Octet 1 is incorrect");
         }
         if (temp2 > 255 || temp2 < 0) {
             System.out.println("Octet 2 is incorrect");
         }
         if (temp3 > 255 || temp3 < 0) {
             System.out.println("Octet 3 is incorrect");
         }
         if (temp4 > 255 || temp4 < 0) {
             System.out.println("Octet 4 is incorrect");
         }if ((temp1 < 256 )&&(temp2 < 256 )&&(temp3 < 256 )&&(temp4 < 256)){
             System.out.println("IP Address: " + temp1 + "." + temp2 + "." + temp3 + "." + temp4);
         }


     /*
      * Write your code here
      * Copy and paste your entire program to Code Runner
      * to complete the activity, from the first import statement
      * to the last bracket.
      */
    }
}