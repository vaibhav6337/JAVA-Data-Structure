public class lecture16_8_paair {
    public static void pairs(int num[]){
        int totalPairs=0;
        System.out.println("\n\n");
        for(int i=0;i<num.length-1;i++){
            System.out.print("Pairs of "+num[i]+" : ");
            for(int j=i+1;j<num.length;j++){
                
                System.out.print("("+num[i]+","+num[j]+")  ");
                totalPairs++;
            }
            System.out.println("\n");
        }
        System.out.println("Total Pairs : "+totalPairs);
    }
    public static void main(String[] args) {
        int num[]={12,32,43,50,65,70};
        pairs(num);

    }
}
