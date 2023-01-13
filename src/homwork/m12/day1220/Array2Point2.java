package homwork.m12.day1220;

public class Array2Point2 {
    public static void main(String[] args) {
        int[][] score = new int[5][3];
        score[0][0] = 100;
        score[0][1] = 100;
        score[0][2] = 100;

        score[1][0] = 89;
        score[2][1] = 76;
        score[1][2] = 92;

        score[2][0] = 88;
        score[2][1] = 69;
        score[2][2] = 72;

        score[3][0] = 45;
        score[3][1] = 60;
        score[3][2] = 59;

        score[4][0] = 96;
        score[4][1] = 92;
        score[4][2] = 89;

        for (int[] num : score){
            for (int score1 : num){
                System.out.print(score1+" ");
            }
            System.out.println();
        }
    }
}
