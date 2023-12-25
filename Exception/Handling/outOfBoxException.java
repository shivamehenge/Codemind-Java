package Exception.Handling;

public class outOfBoxException {
    public  static void main(String args[]){
        int[] arr = new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
//        System.out.println(arr[3]);
//        for(int i =0;i<=3;i++){
//            System.out.println(arr[i]);
//        }

        try {
            String str = "Hello my Name is Shiva!!";
            char c = str.charAt(40);
            System.out.println(c);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("StringOutOfBoundException");

        }
    }
}
