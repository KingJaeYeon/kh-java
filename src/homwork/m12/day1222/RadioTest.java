package homwork.m12.day1222;

class Radio {
    private String name;
    private double channel;
    private int volume;
    private boolean onOff;

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public void setRadio(String name, double channel, int volume) {
        this.name = name;
        this.channel = channel;
        this.volume = volume;
    }

    public void printInfo() {
        System.out.printf("[%s]\n", name);
        if (onOff)
            System.out.println("라디오가 켜져있습니다.");
        else
            System.out.println("라디오가 꺼져있습니다.");
        System.out.printf("현재 채널은 %.1f 입니다.\n", channel);
        System.out.printf("볼륨은 %d 입니다.\n", volume);
    }
}

public class RadioTest {
    public static void main(String[] args) {
        Radio bRadio = new Radio();
        bRadio.setOnOff(true);
        bRadio.setRadio("브리츠 라디오",89.1,12);
        bRadio.printInfo();

        System.out.println();
        Radio iRadio = new Radio();
        iRadio.setOnOff(false);
        iRadio.setRadio("아이리버 라디오",95.1,9);
        iRadio.printInfo();
    }
}
