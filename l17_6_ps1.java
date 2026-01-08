public class l17_6_ps1 {

    
    public static void main(String[] args) {
        int num[]={1,2,3,4,6,4};
        int flag=0;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    flag=1;
                }
            }
        }
        if(flag==1){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
}
