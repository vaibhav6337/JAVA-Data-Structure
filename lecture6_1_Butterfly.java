//Butterfly Pattern
// public class lecture6_1_Butterfly {
//     public static void main(String[] args) {
        
    
//     int n=6;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         for(int k=n-i;k>=1;k--){
//             System.out.print(" ");
//         }
//         for(int l=n-i;l>=1;l--){
//             System.out.print(" ");
//         }
//         for(int m=1;m<=i;m++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }


//     for(int i=1;i<=n;i++){
//         for(int j=n;j>=i;j--){
//             System.out.print("*");
//         }
//         for(int k=1;k<=i-1;k++){
//             System.out.print(" ");
//         }
//         for(int l=1;l<=i-1;l++){
//             System.out.print(" ");
//         }
//         for(int m=n;m>=i;m--){
//             System.out.print("*");
//         }
//         System.out.println();
//     }

// }
// }


//Butterfly Pattern
public class lecture6_1_Butterfly {
    public static void main(String[] args) {
        
    
    int n=6;
    for(int i=1;i<=n;i++){

        for(int j=1;j<=i;j++){
            System.out.print("*");
        }

        //For Spaces
        for(int k=2*(n-i);k>=1;k--){
            System.out.print(" ");
        }

        for(int m=1;m<=i;m++){
            System.out.print("*");
        }

        System.out.println();
    }


    for(int i=1;i<=n;i++){

        for(int j=n;j>=i;j--){
            System.out.print("*");
        }

        //For Spaces
        for(int k=1;k<=2*(i-1);k++){
            System.out.print(" ");
        }
        
        for(int m=n;m>=i;m--){
            System.out.print("*");
        }
        
        System.out.println();
    }

}
}