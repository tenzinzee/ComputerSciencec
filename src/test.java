/**
 * Created by Kevin on 10/21/16.
 */
public class test {
    public static void main(String[] args)
    {
        double count = 6.0;
        for (int num = 0; num < 5; num++){
            if (count != 0 && num / count > 0){
                count -= num;
            }
        }
        System.out.println(count);
    }
}
