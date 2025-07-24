import java.util.*;
public class lecture3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age : ");
        int age=sc.nextInt();
        if(age<18){
            System.out.println("You are not Adult");
        }
        else{
            System.out.println("You are Adult");
        }
        
    }
}
