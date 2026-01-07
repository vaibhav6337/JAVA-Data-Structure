
public class lecture16_4_linear {
    public static int linear(int arr[],int key){
    
    for(int i=0;i<arr.length;i++){
        if(arr[i]==key){
            return i;
        }
    }
    return -1;
    }
    public static void main(String[] args){
        int arr[]={10,23,43,542,12,11,56,2345,765,434};
        int key=2345;
        int index=linear(arr,key);
        if(index==-1){
            System.out.println("Key is not found");
        }else{
            System.out.println("key is found at index "+index);
        }

    }
}
