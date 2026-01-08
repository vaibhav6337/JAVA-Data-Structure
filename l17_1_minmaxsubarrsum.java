import java.util.*;
public class l17_1_minmaxsubarrsum {
     public static void maxsubarrsum(int num[]){
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                sum=0;
                int end=j;
                for(int k=start;k<=end;k++){
                sum=sum+num[k];
                }
                System.out.println(sum);
                if(maxSum<sum){
                    maxSum=sum;
                }   
                if(minSum>sum){
                    minSum=sum;
                }      
            }
        }
        System.out.println("Maximum Sum : "+maxSum);
        System.out.println("Minimum Sum : "+minSum);
    }
    public static void main(String[] args) {
        int num[]={2,4,5,8,-6,10};
        maxsubarrsum(num);
    }
}
