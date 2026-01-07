public class lecture16_10_sumsubarr {
    
    public static void subarr(int num[]){
        int sum=0;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                sum=0;
                int end=j;
                System.out.print("( ");
                for(int k=start;k<=end;k++){
                System.out.print(num[k]+" ");
                sum=sum+num[k];
                }
                System.out.print(")  Sum : "+sum);
                
                System.out.println();
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int num[]={2,4,5,8,10};
        subarr(num);
    }
}


