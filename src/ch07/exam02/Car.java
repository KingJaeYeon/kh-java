package ch07.exam02;

public class Car {
    String color;
    int speed;
    int gear;

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", gear=" + gear +
                '}';
    }

    void changeGear(int g) {
        this.gear = g;
    }

    void speedUp() {
        this.speed += 10;
    }

    void speedDown() {
        this.speed -= 10;
        if (speed < 0)
            speed = 0;
    }
}
