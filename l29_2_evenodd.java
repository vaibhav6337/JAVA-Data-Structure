public class l29_2_evenodd {
    public static void evenodd(int n){
        int bitMask=1;

        if((n & bitMask)==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        evenodd(11);
        evenodd(20);
        evenodd(3);
        evenodd(6);
    }
}
