//Rhombus Pattern
public class lecture6_2_Rhombus {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            //For Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
