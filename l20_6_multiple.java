
public class l20_6_multiple {
    public static void main(String[] args) {
        Innova i=new Innova();
        i.running();
        i.service();
        i.brandName();
        i.carName();
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
class Innova extends Toyota{
    int topSpeed;
    void carName(){
        System.out.println("Car name is Innova");
    }
}


