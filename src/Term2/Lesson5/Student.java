package Term2.Lesson5;

/**
 * Created by walterhuang on 1/16/17.
 */
public class Student {
    private int grade;
    private double GPA;
    private int id;
    private static int num;
    private String fname;
    private String lname;
    public Student (){
        num++;
        id = num;
        fname = "None";
        lname = "None";
        GPA = 0.0;
        grade = 0;
    }
    public Student(String firstName, String lastName, int gradeLevel, double gpa){
        num++;
        id = num;
        fname = firstName;
        lname = lastName;
        if (gradeLevel >= 0 && gradeLevel <= 12){
            grade = gradeLevel;
        }else{
            grade = 0;
        }
        if(gpa >= 0 && gpa <= 4.5){
            GPA = gpa;
        }else{
            GPA = 0.0;
        }

    }
    public String toString(){
        return lname + ", " + fname + "\n" + "GPA: " + GPA + "\n" + "Grade Level: " + grade + " id # " + id;
    }
}

