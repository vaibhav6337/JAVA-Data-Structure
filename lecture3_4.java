import java.util.*;
public class lecture3_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 2 number : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.println("Both a and b are Equal");
        }
        else if(a<b){
            System.out.println("a is lesser than b");
        }else{
            System.out.println("a is greater than b");
        }
    }
}
