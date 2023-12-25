package Exception.Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exceptionHandling {
    public static void main(String args[])  {
        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 12;
        arr[2] = 13;
        arr[3] = 15;
        arr[4] = 100;

        //System.out.println(arr[4]);
        for(int i=0;i< 5;i++){
            System.out.println(arr[i]);
        }

        File file = new File ("shivaMehenge.txt")
        ;

        boolean isProcess = true;
        try {
            FileInputStream inputStream = new FileInputStream(file);
        }catch(FileNotFoundException ex){
            isProcess = false;
            System.out.println("File is not found to inform developer!!");
        }
        if(isProcess) {
            System.out.println("File process is done!!");
        }else{
            System.out.println("File Process Failure!!");
        }

    }
}
