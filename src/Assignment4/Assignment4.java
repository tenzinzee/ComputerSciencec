package Assignment4;

import java.util.Scanner;

//将 Assignment4 更改为 Main 即可

public class Assignment4 {

    public static void main(String[] args) {
        int Hashtags = 0;
        int Mentions = 0;
        int Excess = 0;
        boolean retweet = false;

        System.out.println("Please enter a tweet:");
        Scanner s = new Scanner(System.in);
        char[] content = (s.nextLine() + "   ").toLowerCase().toCharArray();
        for(int i = 0;  i < content.length && i < 143; i++){
            if (content[i] == '@' && (content[i + 1] != ' ' && content[i + 1] != '\t')){
                Mentions++;
            }if (content[i] == '#' && (content[i + 1] != ' ' && content[i + 1] != '\t' )){
                Hashtags++;
            }if (content[i] == 'r') {
                if (content[i + 1] == 't' && content[i + 2] == ':') {
                    retweet = true;
                }
            }

            Excess = (content.length - 143);
        }

        if (Excess > 0) {
            System.out.println("Excess Characters: " + Excess);
        }else if(retweet) {
            System.out.println("Length Correct");
            System.out.println("Number of Mentions: " + Mentions);
            System.out.println("Number of Hashtags: " + Hashtags);
            System.out.println("The input was a retweet.");

        }else{
            System.out.println("Length Correct");
            System.out.println("Number of Mentions: " + Mentions);
            System.out.println("Number of Hashtags: " + Hashtags);
            System.out.println("The input was not a retweet.");
        }



    }
}