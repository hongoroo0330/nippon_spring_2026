public class Main {
    
    public static void main(String[] args) {
        System.out.println("Class and Objects");
        Human Hongoroo = new Human();
        System.out.println(Hongoroo.Age);
        System.out.println(Hongoroo.firstName);
        
        System.out.println(Hongoroo.lastName);
        System.out.println(Hongoroo.gender);
        Hongoroo.gender = "Eregtei";
        Hongoroo.firstName = "Hongrooo";
        Hongoroo.lastName = "Enhbayar";
        System.out.println(Hongoroo.gender);
        System.out.println(Hongoroo.firstName);
        System.out.println(Hongoroo.lastName);
        Animal horse = new Animal();
        horse.Torol = "Mamalia";
        horse.Huis = "male";
        horse.Nas = 6;
        System.out.println(horse.Huis);
        System.out.println(horse.Nas);
        System.out.println(horse.Torol);

        Child mychild = new Child("Khangaikhuu", 0);
        System.out.println(mychild.age);
        System.out.println(mychild.name);
        Student zayaStudent = new Student(20, "Zaya", 4.0);

        zayaStudent.printHello();
        zayaStudent.introduceMyself();


    }
    
}
