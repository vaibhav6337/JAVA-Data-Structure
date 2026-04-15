class l20_13_static {
    public static void main(String[] args) {
        sample s1=new sample();
        s1.setString("Vaibhav");
        System.out.println(s1.geString());

        sample s2=new sample();
        System.out.println(s2.geString());   //here also it will returs vaibhav even if we have not set the string for s2 because name is static variable and it is shared by all the objects of the class.
    }
}

class sample{

    static int returnMarks(int english,int math,int science){
        return english+math+science;
    }
    
    static String name;

    void setString(String name){
        this.name=name;
    }
    String geString(){
        return name;
    }
}