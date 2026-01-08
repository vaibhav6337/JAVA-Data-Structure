import java.util.Arrays;

public class l17_6_ps2 {
    public static void main(String[] args) {
        int num[]={-1, 0,  1, 2, -1, -4};
        Arrays.sort(num);
        int n=num.length;

        if(n==0){
            System.out.println("[]");
        }

        if(n==1 ){
            if(num[0]==0 ){
                System.out.println("[]");
            }
        }

        for(int i=0;i<n-2;i++){

            if(i>0 && num[i]==num[i-1]){
                continue;
            }
            for(int j=i+1;j<n-1;j++){

                if(j>i+1&&num[j]==num[j-1]){
                    continue;
                }

                for(int k=j+1;k<n;k++){

                     if (k > j + 1 && num[k] == num[k - 1]){
                        continue;
                }

                    if(num[i]+num[j]+num[k]==0){
                        System.out.println("["+num[i]+","+num[j]+","+num[k]+"]");
                    
                }
                }
            }
        }
    }
}
