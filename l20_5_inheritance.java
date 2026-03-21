public class l20_5_inheritance {
    public static void main(String[] args) {
        Innova i=new Innova();
        i.running();
        i.service();
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

class Innova extends Car{
    int topSpeed;
    void carName(){
        System.out.println("Car name is Innova");
    }
}


