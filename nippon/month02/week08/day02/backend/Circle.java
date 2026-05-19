public class Circle {
   public double radius;
    Circle (double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * (radius * radius);
    }
     public double circumference() {
        return 2 * Math.PI * radius;
    }
    public boolean isLarger(Circle other) {
        return area() > other.area();
    }
    public void showInfo() {
        System.out.println(area());
        System.out.println(circumference());
        
    }
    
}
