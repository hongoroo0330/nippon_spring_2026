public class Rectangle {
    double w;
    double h;

    Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    double area() {
        return w * h;

    }

    double perimeter() {
        return 2 * (w + h);
    }
    boolean isSquare() {
        return w == h;
    }

    public void showInfo() {
        System.out.println(area());
        System.out.println(perimeter());
        System.out.println(isSquare());
    }
}
        
