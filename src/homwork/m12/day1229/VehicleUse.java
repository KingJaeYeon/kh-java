package homwork.m12.day1229;

public class VehicleUse {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Car");
        v.speedUp();
        v.speedDown();
        v.handling();

        v = new Plane("Plane");
        v.speedUp();
        v.speedDown();
        v.handling();

        v = new Boat("Boat");
        v.speedUp();
        v.speedDown();
        v.handling();
    }
}
 class Vehicle{
    String vehicle;
    Vehicle(String vehicle){
        this.vehicle = vehicle;
    }
    void speedUp(){
        System.out.println(vehicle+" SpeedUp");
    }
    void speedDown(){
        System.out.println(vehicle+" SpeedDown");
    }
    void handling(){
        System.out.println(vehicle+" Handling");
    }
}
class Plane extends Vehicle{
    Plane(String vehicle){
        super(vehicle);
    }
    @Override
    void speedUp() {
        super.speedUp();
    }

    @Override
    void speedDown() {
        super.speedDown();
    }

    @Override
    void handling() {
        super.handling();
    }
}
class Boat extends Vehicle{
    Boat(String vehicle) {
        super(vehicle);
    }

    @Override
    void speedUp() {
        super.speedUp();
    }

    @Override
    void speedDown() {
        super.speedDown();
    }

    @Override
    void handling() {
        super.handling();
    }
}