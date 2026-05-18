public class Student {
    int age;
    String name;
    double gpa;

    Student(int age, String name, double gpa){
        this.age = age;
        this.name = name;
        this.gpa = gpa;

    }
    public void printHello(){
        System.out.println("Hello Student");
    }
    void introduceMyself () {
        System.out.println(" My name is " + name + " i'm " + age + " years old.");
    }
    
}
