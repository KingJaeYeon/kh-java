package ch09;

public class Area {
    //멤버변수
    private int width;
    private int length;
    //Constructor
    public Area(){}

    public Area(int width, int length) {
        this.width = width;
        this.length = length;
    }
    //Method
    public int getArea(){
        return width * length;
    }
}
class Volume extends Area{
    private int height;

    public Volume(){}
    public Volume(int width, int length, int height){
        super(width, length);
        this.height = height;
    }

    public int getVolume(){
        return getArea() * height;
    }
}
class VolumeUse{
    public static void main(String[] args) {
        Volume volume = new Volume();
        System.out.println("부피 : " + volume.getVolume());
        Volume volume1 = new Volume(10,20,30);
        System.out.println("부피 : " + volume1.getVolume());
    }
}