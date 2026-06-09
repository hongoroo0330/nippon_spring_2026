public class Main {
    public static void main(String[] args) {
        Father myFather = new Father("Enkhbayar", 55);
        myFather.printInfo();
        Son mySon = new Son("Khongoroo", 25);
        mySon.printInfo();
        Animal myAnimal = new Animal(true, "male", "race");
        myAnimal.printInfo();
        Dog myDog = new Dog(false, "female", "bulldog");
        myDog.printInfo();
        Bird myBird = new Bird("female", "race");
        myBird.printInfo();

    }
    
}
