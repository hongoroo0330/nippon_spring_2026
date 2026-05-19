public class Main { public static void main(String[] args) {
    Rectangle r1 = new Rectangle(5, 3);
    r1.showInfo();
    Rectangle r2 = new Rectangle(4, 4);
    System.out.println(r2.isSquare());
    Circle c1 = new Circle(5);
    Circle c2 = new Circle(3);
    c1.showInfo();
    System.out.println(c1.isLarger(c2));
    int [] scores1 = {90, 89, 87, 65, 50};
    int [] scores2 = {85, 100, 53, 45,60};
    int [] scores3 = {90, 87, 88, 90, 66};
    StudentTracker s1 = new StudentTracker("Bat", scores1 );
    StudentTracker s2 = new StudentTracker("Saruul", scores2);
    StudentTracker s3 = new StudentTracker("Monh", scores3);
    s1.showReport();
    s2.showReport();
    s3.showReport(); 

     
    
}
    

    
}
