public class lecture16_6_binary {
    public static int binary(int num[],int key){
        int start=0,end=num.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            else if(num[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={10,22,30,45,59,68,82,90};
        int key=68;
        if(binary(num, key)==-1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("Number found at index "+binary(num, key));
        }
    }
}
