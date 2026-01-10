import java.util.Scanner;

public class l19_1_2darray {
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=3,m=3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in array : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("Enter the value : ");
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix is  : \n\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print (matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
