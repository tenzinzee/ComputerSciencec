package Term2.Assignment3;

/**
 * Created by walterhuang on 2/6/17.
 */
public class Teacher extends Person {
    public String Subject = "";
    public Teacher(String fName, String lName, String subject){
        super(fName,lName);
        Subject = subject;
    }
    public String toString(){
        return super.toString() + "\n" + "\t" + "Subject: " + Subject;

    }
}
