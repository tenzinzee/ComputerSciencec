import java.util.Scanner;

public class Main {
    
    double t1;
    double t2;
    double t3;
    double ta;
    int q1;
    int q2;
    double qa;
    double hw;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Please enter your test grades.");
        
        System.out.println("Test 1: ");
        t1 = s.nextDouble();
        
        System.out.println("Test 2: ");
        t2 = s.nextDouble();
        
        System.out.println("Test 3: ");
        t3 = s.nextDouble();
        
        ta = (t1 + t2 + t3) / 3.0;
        
        System.out.println("Please enter your quiz grades.");
        
        System.out.println("Quiz 1: ");
        q1 = s.nextInt();
        
        System.out.println("Quiz 2: ");
        q2 = s.nextInt();
        
        qa = (q1 + q2) / 2.0;
        
        System.out.println("Please enter your homework average.");
        
        System.out.println("Homework: ");
        hw = s.nextDouble();
        
        System.out.println("Test Average: " + ta);
        System.out.println("Quiz Average: " + qa);
        System.out.println("Final Grade: " + ((ta * 0.4) + (qa * 0.35) + hw * 0.25));

    }
}
