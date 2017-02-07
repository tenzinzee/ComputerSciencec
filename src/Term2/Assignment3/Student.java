package Term2.Assignment3;

/**
 * Created by walterhuang on 2/6/17.
 */
public class Student extends Person{
    public int studentId = 0;
    public   int level = 0;
    private static Integer num = 0;
    public  Student(String fName, String lName, int gLevel){
        super(fName,lName);
        num++;
        studentId = num;
        if (!(gLevel >= 0  && gLevel <= 12)){
            level = 0;
        }else{
            level = gLevel;
        }

    }
    public   int getLevel(){
        return level;
    }
    public String toString(){
        return super.toString()+ "\n" + "\t" + "Grade Level: " + level + "\n" + "\t" + "ID: " + studentId;
    }
}
