public class l20_10_overriding {
    public static void main(String[] args) {
        Deer d=new Deer();
        d.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("Eat Anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eat Grass");
    }
}
