public class l28_6_lexicolargest {
    public static void main(String[] args) {
        String cars[]={"Brezza","Innova","City","Alto","Cruise","S-Presso"};
        String largest=cars[0];

        for(int i=1;i<cars.length;i++){
            if(largest.compareToIgnoreCase(cars[i])<0){
                largest=cars[i];
            }
        }
        System.out.println("Largest String by LexicoOrder : "+largest);
    }

    
}
