import java.util.*;
public class lecture14_5_binomialcoe {
    public static int fact(int n){
        int f=1;
        if(n==0 || n==1){
            return f;
        }
        
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int binCoeff(int n, int r){
        int bc,n_fact,r_fact,nr_fact;        
        n_fact=fact(n);
        r_fact=fact(r);
        nr_fact=fact(n-r);
        bc=n_fact/(r_fact*nr_fact);        
        return bc;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,r;
        System.out.print("Enter the value of n : ");
        n=sc.nextInt();
        System.out.print("Enter the value of r : ");
        r=sc.nextInt();
        System.out.println("Binomial Coeficient : "+binCoeff(n, r));
    }
}
