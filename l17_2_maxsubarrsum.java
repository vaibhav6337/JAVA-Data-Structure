public class l17_2_maxsubarrsum {
    
     public static void maxsubarrsum(int num[]){
        int sum=0;
        int prefix[]=new int[num.length];
        int maxSum=Integer.MIN_VALUE;
        prefix[0]=num[0];

        for(int i=1;i<num.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }
        
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                sum=start==0 ? prefix[end] : prefix[end]-prefix[start-1];              
                if(maxSum<sum){
                    maxSum=sum;
                }                     
            }
        }
        System.out.println("Maximum Sum : "+maxSum);
    }
    public static void main(String[] args) {
        int num[]={2,4,5,8,-6,10};
        maxsubarrsum(num);
    }

}
