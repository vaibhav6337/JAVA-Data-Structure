public class l29_7_countsetbit {
    public static int count(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count=count+1;
            }
            n=n>>1;

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count(10));
    }
}
