package homwork.m12.day1230;

public class AutoBox2 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Integer i1, i2, i3;

        i1 = 30;
        num1 = i1;
        print(num1,i1);

        i2 = num1+10;
        num2 = i2;
        print(num2,i2);

        i3 = num2+10;
        num3 = i3;
        print(num3,i3);
    }
    public static void print(int a, Integer b){
        System.out.printf("기본 자료형: %d, 객체자료형: %d\n",a,b);
    }
}
