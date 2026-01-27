public class l29_4_setClearithBit {
    public static int setithBit(int n,int i){
        int bitMask=1<<i;

        return n |bitMask;
    }

    public static int clearithBit(int n,int i){
        int bitMask=~(1<<i);
        return n&bitMask;
    }
    public static void main(String[] args) {
        System.out.println(setithBit(10,2));
        System.out.println(clearithBit(10,1));
    }


}
