import java.util.*;
public class lecture3_ps_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 2 numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("1.Add  2.Subtract  3.Multiplication  4.Division  5.Remainder");
        System.out.println("Enter your choice : ");
        int ch=sc.nextInt();
        switch(ch){
            case 1 : System.out.println("Addition : "+(a+b));
            break;
            case 2 : System.out.println("Subtraction : "+(a-b));
            break;
            case 3 : System.out.println("Multiplication : "+(a*b));
            break;
            case 4 : System.out.println("Division : "+(a/b));
            break;
            case 5 : System.out.println("Remainder : "+(a%b));
            break;
            default: System.out.println("Enter proper choice");
        }
    }
}
