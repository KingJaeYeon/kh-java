package homwork.m12.day1229;

public class Notebook implements Controllable {
    @Override
    public void turnOn() {
        System.out.println("노트북을 켠다");
    }

    @Override
    public void turnOff() {
        System.out.println("노트북을 끈다");
    }

    @Override
    public void fix() {
        System.out.println("장비를 수리한다.");
    }

    @Override
    public void reSet() {
        System.out.println("장비를 초기화한다.");
    }

    public static void main(String[] args) {
        Notebook c = new Notebook();
        c.turnOn();
        c.turnOff();
        c.fix();
        c.reSet();
    }
}

interface Controllable {
    void turnOn();

    void turnOff();

    void fix();

    void reSet();
}