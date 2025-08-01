public class lecture6_5_Dimond {
    public static void main(String[] args) {
        int n=4;
        //Upper Half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

//Lower Half
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i-1;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j<=(n*2)-i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //2ND Logic of Lower Half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
