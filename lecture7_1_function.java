import java.util.*;
public class lecture7_1_function {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n;
        n=sc.next();
        printMyName(n); //Calling of Function
        
    }
}
