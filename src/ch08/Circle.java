package ch08;

public class Circle {
    double radius;
    String color;

    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    public Circle(double r) {
        this(r, "파랑");
    }

    public Circle(String c) {
        this(21.0, c);
    }

    public Circle() {
        this(3.5, "빨강");
    }

    public void print() {
        System.out.println("반지름: " + radius);
        System.out.println("색깔: " + color);
        System.out.println();
    }
}

class CircleUse {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.print();

        Circle c2 = new Circle(10.0, "빨강");
        c2.print();

        Circle c3 = new Circle("노랑");
        c3.print();

        Circle c4 = new Circle(15.0);
        c4.print();
    }
}