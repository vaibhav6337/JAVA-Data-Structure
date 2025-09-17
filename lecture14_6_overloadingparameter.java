public class lecture14_6_overloadingparameter{
    //function to calculate sum of 2 numbers
public static int sum(int a, int b) {
    return a+b;
}

//function to calculate sum of 3 numbers
public static int sum(int a, int b, int c) {
    return a+b+c;
}
    public static void main(String[] args) {
        System.out.println("Sum of 2 numbers : "+sum(10,5));
        System.out.println("Sum of 3 numbers : "+sum(10,5,20));
    }
}