public class l20_1_class {
  public static void main(String[] args) {
    Pen p1=new Pen();
    p1.setColor("Blue");
    System.out.println(p1.color);
    p1.setTip(4);
    System.out.println(p1.tip);

    p1.color="Yellow";
    System.out.println(p1.color);
  }  
}

class Pen{
    String color;
    int tip;

    void setColor(String newcolor){
        color=newcolor;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}

class student{
    int perc;
    void percentage(int maths, int chemistry, int physics){
        perc=(maths+chemistry+physics)/3;
    }
}
