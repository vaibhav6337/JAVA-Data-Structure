//Palindrome number pyramid

public class lecture5_12 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            
            for(int k=i;k>=1;k--){
                
                if(k!=1){
                System.out.print(" "+k+" ");}
            }
            System.out.print(" 1 ");
            for(int l=1;l<=i;l++){
                if(l!=1){
                System.out.print(" "+l+" ");}
            }
            System.out.println();
        }
    }
}
