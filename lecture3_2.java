import java.util.*;
public class lecture3_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("This number is Even");
        }else{
            System.out.println("This number is Odd");
        }
    }
}
