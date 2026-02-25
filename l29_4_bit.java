public class l29_4_bit {
    public static int setithBit(int n,int i){
        int bitMask=1<<i;

        return n |bitMask;
    }

    public static int clearithBit(int n,int i){
        int bitMask=~(1<<i);
        return n & bitMask;
      
    }

    public static int updateithBit(int n,int i,int newBit){
        // if(newBit==0){
        //     return clearithBit(n,i);
        // } else{
            
        //     return setithBit(n,i);
        // }

        n=clearithBit(n,i);
        int bitMask=newBit<<i;
        return n | bitMask;
    }
    public static int clearIBit(int n,int i){
        int bitMask=(~0)<<i;
        return n&bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearIBit(15,2));

    }


}
