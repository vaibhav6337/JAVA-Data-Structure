import java.util.*;
public class lecture4_6ps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n  : ");
        int n=sc.nextInt();
        System.out.println("Table of "+n+"\n");
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+(n*i));
            
        }
    }
}
