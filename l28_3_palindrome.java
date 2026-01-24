public class l28_3_palindrome {
    public static void palindrome(String str){
        int n=str.length();
        int flag=0;
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is NOT Palindrome");
        }
    }
    public static void main(String[] args) {
        String str="racecar";
        palindrome(str);
    }
}
