public class l20_3_constructor {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("Vaibhav");
        Student s3=new Student(95);
    }
}
class Student{
    int marks;
    String name;
    Student(){
        System.out.println("Constructor Called......... ");
    }
    Student(String name){
        this.name=name;
        System.out.println("Name: "+this.name);
    }
    Student(int marks){
        this.marks=marks;
        System.out.println("Marks: "+this.marks);
    }
}
