public class l20_4_copyconstructor {

    public static void main(String[] args) {
        Student s1=new Student();
        s1.marks[0]=92;
        s1.marks[1]=95;
        s1.marks[2]=90;
        s1.name="Vaibhav";
        s1.password=6337;
        Student s2=new Student(s1);
        System.out.println(s2.name);
        
        System.out.println(s2.password);
        s2.password=90090;
        s2.marks[0]=99;
        s2.marks[1]=92;
        s2.marks[2]=90;
        System.out.println(s2.password);
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    int marks[];   
    String name;
    int password;
    Student(){
        marks=new int[3];
        System.out.println("Constructor Called......... ");
    }
    Student(Student s1){
        this.name=s1.name;
        this.marks=s1.marks;
        this.password=s1.password;
    }
    Student(String name){
        this.name=name;
        System.out.println("Name: "+this.name);
    }
    
}
