import java.util.*;
public class lecture16_5_arrsmalllarge {
    public static int smalllarge(int num[]){
        int largest=Integer.MIN_VALUE;  //-infinity
        int smallest=Integer.MAX_VALUE;  //infinity
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
            if(smallest>num[i]){
                smallest=num[i];
            }            
        }
        System.out.println("Smallest from array : "+smallest);
        return largest;
    }
    public static void main(String[] args){
        int num[]={10,23,43,542,12,11,56,2345,9,765,434};
        int largest=smalllarge(num);
        System.out.println("Largest from array : "+largest);
    }
}
