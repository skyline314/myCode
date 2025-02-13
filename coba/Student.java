public class Student{
    String name;
    String id;
    int age;
    
    public Student(String name , String id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void sayHello(String name){
        System.out.println("Hello " + name + ", my name is " + this.name + ".");
    }
}