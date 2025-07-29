//floyd's triangle
public class lecture5_9 {
    public static void main(String[] args) {
        int n=5;
        int s=0;
        for(int i=1;i<=5;i++){
            
            for(int j=1;j<=i;j++){
                s++;
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}
