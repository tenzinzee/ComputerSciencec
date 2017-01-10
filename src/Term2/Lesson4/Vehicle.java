package Term2.Lesson4;

import java.util.ArrayList;
import java.util.Scanner;

//revise the class name Lesson4 into Vehicle
public class Vehicle {
    private int a;
    private String location = "@";

    public Vehicle(){
        a = 0;
    }

    public Vehicle(int loc) {
        if (loc <=20 && loc >=-20){
            a = loc;
        }else {
            a = 0;
        }
    }
    
    public void forward(){
        if (a<20){
            a +=1;
        }
    }

    public void backward(){
        if (a>-20){
            a -=1;
        }
    }

    public String toString(){
        location ="@";
        for(int i = -20; i < a; i++) {
            location = " " + location.substring(0, location.length());
        }


        return location;
    }

    public int getLocation() {
        return  a;
    }
}
