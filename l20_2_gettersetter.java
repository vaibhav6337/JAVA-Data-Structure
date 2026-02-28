public class l20_2_gettersetter {
    public static void main(String[] args) {
        Pen p=new Pen();
        p.setColor("Yellow");
        p.setTip(4);
        System.out.println(p.getTip());
        System.out.println(p.getColor());

    }
}

class Pen{
    private String color;
    private int tip;

    int getTip(){
        return this.tip;
    }
    String getColor(){
        return this.color;
    }
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
