import java.util.*;
public class lecture14_11_BtoD {
    public static void BtoD(int n){
        int lastDigit;
        int dec=0;
        int base=2;
        int pow=0;
        int nn=n;
        while(n>0){
            lastDigit=n%10;
            dec=dec+((int)Math.pow(base,pow)*lastDigit);
            pow++;
            n=n/10;
        }
        System.out.println("Decimal of "+nn+" : "+dec);
 
    }
    public static void main(String[] args) {
        BtoD(10010);
    }
}
