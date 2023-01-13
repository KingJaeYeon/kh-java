package homwork.m12.day1220;

public class ArrayScore2D {
    public static void main(String[] args) {
        int[][] score = new int[5][3];
        score[0] = new int[]{100, 100, 100};
        score[1] = new int[]{89, 76, 92};
        score[2] = new int[]{88, 69, 72};
        score[3] = new int[]{45, 60, 59};
        score[4] = new int[]{96, 92, 89};

        int[] sum = new int[score.length];
        char rank;

        System.out.println("번호\t국어\t영어\t수학\t 총점  평균\t등급");
        for (int i = 0; i < score.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + "\t");
                sum[i] += score[i][j];
            }
            System.out.print(" " + sum[i] + "  ");
            System.out.printf("%.1f", sum[i] / 3.0);
            rank = sum[i] / 3 >= 90 ? 'A' : sum[i] / 3 >= 80 ? 'B' : sum[i] / 3 >= 70 ? 'C' : sum[i] / 3 >= 60 ? 'D' : 'F';
            System.out.println("\t" + rank);
        }
    }
}
