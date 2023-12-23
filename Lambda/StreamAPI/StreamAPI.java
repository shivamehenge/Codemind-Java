package Lambda.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String args[]){
        List<String> week1 = Arrays.asList("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");



        //week1.stream().forEach(day-> System.out.println(day));

//        List<String> stream = week1.stream().filter(d->d.startsWith("S")).collect(Collectors.toList());
//        System.out.println(stream);
//        System.out.println(week1);

        List<String> streamlimit = week1.stream().limit(2).collect(Collectors.toList());
        System.out.println(streamlimit);
        System.out.println(week1.stream().sorted().collect(Collectors.toList()));
        System.out.println((long) week1.size());
        System.out.println(Arrays.toString(week1.toArray()));
    }
}
