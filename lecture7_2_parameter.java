import java.util.*;

public class lecture7_2_parameter {

    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static int sum(int a, int b){    //Parameters or Formal Parameters 
        int s=a+b;
        return s; 
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
         int a=sc.nextInt();
        int b=sc.nextInt();
       System.out.println("Sum is : "+sum(a,b));    //Arguments or actual paramter
    }
}
