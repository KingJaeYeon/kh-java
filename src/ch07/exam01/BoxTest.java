package ch07.exam01;

public class BoxTest {
    public static void main(String[] args) {
        Box b;// 객체형 데이터타입 참조변수
        b = new Box();
        b.width = 20;
        b.length = 20;
        b.height  = 30;
        System.out.printf("상자의 가로, 세로, 높이는 %d, %d, %d 입니다.\n",b.width,b.length,b.height);
    }
}
