package Lambda.StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExample {

    public static void main(String args[]){
        List<String> week = Arrays.asList("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");

        for(String str:week){
            if(str.startsWith("S"))
             System.out.println(str);
        }

        week.forEach((x)-> System.out.println(x));


    }
}
