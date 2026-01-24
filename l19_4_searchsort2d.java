public class l19_4_searchsort2d {
    public static boolean search(int arr[][],int key){
        int row=0;
        int col=arr[0].length-1;
        while(col>=0 && row<arr[0].length){
        if(key==arr[row][col]){
            System.out.println("key is found at ("+row+" , "+col+")");
            return true;
        }
        else if(key<arr[row][col]){
            col--;
        }else{
            row++;
        }
        }
        System.out.println("NOT FOUND");
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16},
                    };
        search(arr, 17);
    }
}
