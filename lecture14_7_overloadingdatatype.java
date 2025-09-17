public class lecture14_7_overloadingdatatype {
    //function to calculate sum of interger numbers
public static int sum(int a, int b) {
    return a+b;
}

//function to calculate sum float numbers
public static float sum(float a,float b) {
    return a+b;
}
    public static void main(String[] args) {
        System.out.println("Sum of integer numbers : "+sum(10,5));
        System.out.println("Sum of float numbers : "+sum(4.2f,3.5f));
    }
}

