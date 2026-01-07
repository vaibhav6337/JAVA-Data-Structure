public class lecture16_7_reversearr {
    public static void reverse(int num[]){
        int first=0;
        int last=num.length-1;

        while(first<last){
            int temp=num[first];
            num[first]=num[last];
            num[last]=temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int num[]={23,32,43,54,32,122,211,234};
        System.out.println("\nOriginal Array  :");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        reverse(num);
        System.out.println("\n\nReversed Array : ");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}
