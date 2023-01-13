package ch09;

public class Car {
    int speed;
    public void setSpeed(int speed){
        this.speed = speed;
        System.out.println(speed);
    }
}
class SportsCar extends Car{
    boolean turbo;

    public void setTurbo(boolean turbo){
        this.turbo = turbo;
        System.out.println(turbo);
    }
}
class CarTest{
    public static void main(String[] args) {
        SportsCar sCar = new SportsCar();
        sCar.setSpeed(100);
        sCar.setTurbo(true);
    }
}