public class lecture16_3arr_reference {
    public static void update(int arr[],int nonchange){
        nonchange=5;
        for(int i=0;i<arr.length;i++){
         arr[i]=arr[i]+1;
}
}
    public static void main(String[] args) {
        int arr[]={89,90,91};
        int nonchange=10;
        update(arr, nonchange);
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }
        System.out.println(nonchange);
    }
}
