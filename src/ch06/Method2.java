package ch06;

public class Method2 {
    public static void main(String[] args) {
        System.out.printf("합(%d~%d) : %d\n",1,10,sum(1,10));
        System.out.printf("합(%d~%d) : %d\n",10,100,sum(10,100));
        System.out.printf("합(%d~%d) : %d\n",100,1000,sum(100,1000));
    }

    public static int sum(int startNum, int endNum) {
        int sum = 0;
        for (int i = startNum; i <= endNum; i++) {
            sum += i;
        }
        return sum;
    }
}
