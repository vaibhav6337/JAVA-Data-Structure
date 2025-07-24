import java.util.*;
public class lecture3_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choices : 1 2 3");
        System.out.println("Which Button you want to press : ");

        int a=sc.nextInt();
        switch(a){
            case 1: System.out.println("Namaste");
            break;
            case 2: System.out.println("Hello");
            break;
            case 3: System.out.println("Namaskar");
            break;
            default: System.out.println("Invalid Button");
        }
    }
}
