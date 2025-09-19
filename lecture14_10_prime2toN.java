import java.util.*;

public class lecture14_10_prime2toN {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void rangePrime(int x){
        if(x<1){
            System.out.println("sorry!! You not entered valid number.....");
        }
        for(int i=2;i<=x;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
            
    }
}
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value n : ");
        int n=s.nextInt();
        rangePrime(n);
        
        }     
    
}
