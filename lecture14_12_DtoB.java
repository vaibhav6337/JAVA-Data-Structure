public class lecture14_12_DtoB {
    public static void dtob(int n){
        int rem=0;
        int i=0;
        int mn=n;
        int bin=0;
        while(n>0){
            rem=n%2;
            bin=bin+(rem*(int)Math.pow(10,i));          
            i++;
            n=n/2;
        }
        System.out.print("Binary form of "+mn+" : "+bin);
    }
    public static void main(String[] args) {
        dtob(5);
    }
}
