package ch05;

public class Array2 {
    public static void main(String[] args) {
        //[] 배열첨자, 배열첨자가 2개 => 2차원 배열
        //3행 3열(데이터)의 2차원 배열
        int[][] num1 = {{10,20,30},
                        {40,50,60},
                        {70,80,90}};

        int[][] num2 = new int[3][3];
        num2[0][0] = 10;
        num2[0][1] = 20;
    }
}
