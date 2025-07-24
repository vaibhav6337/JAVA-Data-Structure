import java.util.*;
public class lecture3_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choices : 1 2 3");
        System.out.println("Which Button you want to press : ");

        int a=sc.nextInt();
        if(a==1){
            System.out.println("Hello");
        }
        else if(a==2){
            System.out.println("Namaste");
        }else if (a==3){
            System.out.println("Namaskar");
        }
        else{
            System.out.println("You pressed invalid button.....");
        }
    }
}
