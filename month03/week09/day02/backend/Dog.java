public class Dog extends Animal {
    public Dog(boolean canRun, String gender, String race) {
        super(canRun, gender, race);
    }
    @Override
    public void printInfo() {
        System.out.println(" Dog has gender of " + getGender() + ". " + getRace());
        super.printInfo();
    }
    
    
}
