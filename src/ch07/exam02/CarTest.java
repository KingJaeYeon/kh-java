package ch07.exam02;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "red";
        myCar.changeGear(1);
        myCar.speed = 100;
        myCar.speedUp();
        System.out.println(myCar);
    }
}
