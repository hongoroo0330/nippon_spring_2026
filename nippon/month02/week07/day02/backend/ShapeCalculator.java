

public class ShapeCalculator {
    static double circleArea( double r) {

        return Math.PI * (r * r);
       
    }
    static double circlePerimeter(double r) {
        return 2 * Math.PI * r;
    }
    static int rectArea(int w, int h) {

        return  w * h;


    }
    static int rectPerimeter(int w, int h) {
        
        return  2 * (w + h);
    }
    static int triangleArea(int b, int h) {
     
        return   (b * h)/2;
    }
    public static void main(String[] args) {
        System.out.println("=== Хэлбэрийн Тооцоолуур ===");
        System.out.println("тойрог" + "(r=5)");
        System.out.println(" Талбай: " + circleArea(5));
        System.out.println(" Периметр: " + circlePerimeter(5) );
        System.out.println(" Тэгш өнцөгт (4x6)");
        System.out.println(" Талбай: " + rectArea(4, 6));
        System.out.println(" Периметр " + rectPerimeter(4, 6));
        System.out.println("Гурвалжин (b=8, h=5):");
        System.out.println(" Талбай: " + triangleArea(8, 5));
       
        
        
        
    }
    
}
