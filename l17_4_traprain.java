public class l17_4_traprain {
    public static int traprain(int height[]){
        int n=height.length;
        //left max boundary
        int left[]=new int[n];
        left[0]=height[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }

        //calculate right max boundary
        int right[]=new int[n];
        right[n-1]=height[n-1];

        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1], height[i]);
        }
        int trappedWater=0;
        int waterLevel;
        //loop
        for(int i=0;i<n;i++){
            //water level=min(left max boundary,right max boundary)
            waterLevel=Math.min(left[i],right[i]);

            //trapped water=water level-height[i]
            trappedWater+=waterLevel-height[i];
        }

        return trappedWater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(traprain(height));
    }
}
