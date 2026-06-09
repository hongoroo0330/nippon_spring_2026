public class Bird extends Animal{
    public Bird(String gender, String race) {
        super(gender, race);
    }
    @Override
    public void printInfo() {
        
        System.out.println(" Bird has gender of " + gender() + ". " + race() + icanfly());
        super.printInfo();
    }
    public class Bird{
        public Bird(boolean icanfly) {
        
        }
    }
    
}
