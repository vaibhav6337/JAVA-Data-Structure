public class l20_11_abstract {
    public static void main(String[] args) {
        Horse h=new Horse();
        Chicken c=new Chicken();

        h.eat();
        h.walk();
        System.out.println(h.color); //Brown
        c.eat();
        c.walk();
    }
}

abstract class Animal{
    String color;
    Animal(){
        color="Brown";
    }
    void eat(){
        System.out.println("Animal Eating.....");
    }
    abstract void walk();
}

class Horse extends Animal{
    
    void changeColor(){
        color="Dark Brown";
    }
    void walk(){
        System.out.println("Horse walk on 4 legs.....");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("Chicken walk on 2 legs.....");
    }
}

