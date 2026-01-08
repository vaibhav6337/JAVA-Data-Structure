public class l17_3_kadanes_algo {
    public static void kadenes(int num[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;  
        int neg=1;

        for(int i=0;i<num.length;i++){
            if(num[i]>0){
                neg=0;
            }
        }

        if(neg==1){
            for(int i=0;i<num.length;i++){
                maxSum=Math.max(maxSum,num[i]);
            }
            System.out.println(maxSum);
        }
        
        if(neg==0){
        for(int i=0;i<num.length;i++){ 
            currSum=currSum+num[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(maxSum, currSum);
        }
        System.out.println(maxSum);
    }
}
    public static void main(String[] args) {
        int num[]={-22,-3,-5,-32,-3,-2,-5,-9};
        kadenes(num);
    }
}
