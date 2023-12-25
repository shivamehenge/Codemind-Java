import java.util.Arrays;
import java.util.List;

public class ThreadExample{
    public static void main(String args[]) throws InterruptedException {
        new ThreadMethod().getDays();
        Thread.sleep(10000);
        new ThreadMethod().getNumber();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                new ThreadMethod().getDays();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                new ThreadMethod().getNumber();
            }
        });
        t1.start();
        t2.start();
    }
}
class ThreadMethod{

    public void getDays(){
        List<String> daylist =Arrays.asList("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");

        for(int i=0; i<=10;i++){
            System.out.println(daylist);
        }
    }
    public void getNumber(){
        List<Integer> numberlist =Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        for(int i=0; i<=10;i++){
            System.out.println(numberlist);
        }
    }
        }