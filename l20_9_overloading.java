public class l20_9_overloading {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println(c.sum(10,20));
        System.out.println(c.sum((float)10.4,(float)20.3));
        System.out.println(c.sum(10,20,50));
    }
}

class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}
