public class l19_2D_PS2 {
    public static int sum(int arr[][]){
        int m=arr[0].length;
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==1){
                    sum=sum+arr[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] arr = { 
                        {1,4,9},
                        {11,4,3},
                        {2,2,3} 
                    };
                    
        System.out.println("Sum of numbers in Second row : "+sum(arr));

    }
}
