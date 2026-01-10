import java.util.Scanner;

public class l19_2_search2D {
    public static boolean search2D(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("Key is found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key is not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=3,m=3;
        int key;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in array : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("Enter the value at ("+i+","+j+") : ");
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the key : ");
        key=sc.nextInt();
        search2D(matrix, key);
    }
}
