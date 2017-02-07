package Term2.Assignment3;

/**
 * Created by walterhuang on 2/6/17.
 */
public class HighSchoolStudent extends Student {
    public double GPA = 0.0;
    public HighSchoolStudent(String fName, String lName, int gLevel, double gpa){
        super(fName, lName, gLevel);
        if (!(gpa >= 0  && gpa <= 5)){
            GPA = 0;
        }else{
            GPA = gpa;
        }
    }
    public String toString(){
        return super.toString() + "\n" + "\t" + "GPA: " + GPA;
    }
}
