public class l28_7_stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");

        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println("String : "+sb);
        System.out.println("Length : "+sb.length());
    }
}
