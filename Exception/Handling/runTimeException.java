package Exception.Handling;

public class runTimeException {
    static int divideZero(int a, int b) {
        int i = a / b;
        return i;
    }
    static int ComputeZero(int a , int b){
        int res = 0;
        try {
            res = divideZero(a, b);

        }catch(NumberFormatException ex){
            System.out.println("Runtime Exception is present!!");
        }
        return res;
    }

    public static void main(String args[]) {
        int a = 1;
        int b = 0;

        try{
            int i = ComputeZero(a,b);
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            //e.printStackTrace();
        }

    }
}
