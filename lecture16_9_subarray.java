public class lecture16_9_subarray {
    public static void subarr(int num[]){
        int ts=0;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                System.out.print("( ");
                for(int k=start;k<=end;k++){
                System.out.print(num[k]+" ");                
                }
                System.out.print(")");
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays : "+ts);

    }
    public static void main(String[] args) {
        int num[]={2,4,5,8,10};
        subarr(num);
    }
}
