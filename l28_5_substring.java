public class l28_5_substring {
    public static String substring(String str, int si,int ei){
        String snew="";
        for(int i=si;i<ei;i++){
            snew+=str.charAt(i);
        }
        return snew;
    }
    public static void main(String[] args) {
        String str="Hello World";
        System.out.println(str.substring(3,5));
        System.out.println(substring(str, 0, 5));
    }
}
