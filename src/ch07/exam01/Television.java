package ch07.exam01;

public class Television {
    //맴버변수(전역변수)
    private int channel; //channel = 0으로 자동 초기화
    private int volume;
    private boolean onOff; // 전원상태 기본값은 false

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
        if (onOff)
            System.out.println("TV 전원On");
        else
            System.out.println("TV 전원Off");
    }

    void showInfo() {
        System.out.println("텔레비전의 채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
    }
}
