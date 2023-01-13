package ch07.exam01;

public class TelevisionTest {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.setOnOff(true);
        tv.setChannel(7);
        tv.setVolume(5);
        tv.showInfo();
    }
}
