package Term2.Assignment3;

/**
 * Created by walterhuang on 2/6/17.
 */
public class Person {
    public String firstName = "";
    public String lastName = "";
    public Person(String fName, String lName){

        firstName = fName;
        lastName = lName;
    }

    public String toString(){
        return firstName + " " + lastName;
    }
}
