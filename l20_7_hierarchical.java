public class l20_7_hierarchical{
    public static void main(String[] args) {
        Suzuki s=new Suzuki();
        Toyota ty=new Toyota();
        Tata tt=new Tata();
        s.running();
        s.service();
        s.brandName();
        ty.brandName();
        tt.brandName();
    }
}

class Car{
    String color;
    String tyreCompany;
        
   void running(){
        System.out.println("Car is running.....");
    }
    void service(){
        System.out.println("You should do the service of car.......");
    }
}

class Toyota extends Car{
    void brandName(){
        System.out.println("Brand name is Toyota");
    }
    
}
class Suzuki extends Car{
    void brandName(){
        System.out.println("Brand name is Suzuki");
    }
}

class Tata extends Car{
    void brandName(){
        System.out.println("Brand name is Tata");
    }
}


