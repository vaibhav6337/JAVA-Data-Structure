import java.util.*;
public class lecture16_2_arroperation {
    public static void main(String[] args){
        //creation
        int arr[]=new int[50];
        //input
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;

        //output
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);

        //update
        arr[2]=arr[2]+3;
        System.out.println("New updated value : "+arr[2]);

        //length
        System.out.println("Length of Array : "+arr.length);
    


    }
}
