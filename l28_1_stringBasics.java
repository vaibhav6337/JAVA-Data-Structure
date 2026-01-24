import java.util.*;
public class l28_1_stringBasics {
    public static void main(String[] args) {
        // String str=new String("HelloWorld");
        // String str1="Hello";       
        // Strings are Immutable
        // System.out.println(str);


        // Input string
        // String str2;
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter the String : ");
        // str2=sc.nextLine();

        // Length of String
        // int len=str2.length();
        // System.out.println("The string is  "+str2);
        // System.out.println("String length : "+len);

        // Concatination and charAt() function
        String firstName="Vaibhav";
        String lastName="Bhagat";
        String fullName=firstName+" "+lastName;
        System.out.println("Full Name : "+fullName);
        System.out.println("Second Character : "+fullName.charAt(1));
    }
}
