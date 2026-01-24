public class l19_2D_PS3 {
    public static void transpose(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int transposeArray[][]=new int[m][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                transposeArray[j][i]=arr[i][j];        
            }
        }

        System.out.println("\n\nOriginal Matrix \n");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                  System.out.print(arr[i][j]+" ");     
            }
            System.out.println(" ");
        }

        System.out.println("\n\nTranspose Matrix \n");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                  System.out.print(transposeArray[i][j]+" ");     
            }
            System.out.println(" ");
        }
        
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                    {5,6,7,8}
                    
                    };
                          
                    transpose(arr);
    }
}
