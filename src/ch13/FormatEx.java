package ch13;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatEx {
    public static void main(String[] args) {
        //3자리수 콤마 표시
        //[1] String 활용
        int val = 1234000000;
        System.out.printf("%,d%n",val);

        //[2] DecimalFormat 활용
        DecimalFormat df = new DecimalFormat("#,###.0");
        String num = df.format(12300000000.132);
        System.out.println(num);

        //[3] NumberFormat 활용
        NumberFormat nf = NumberFormat.getInstance();
        String num2 = nf.format(1234999.1234);
        System.out.println(num2);

        NumberFormat nf2 = NumberFormat.getInstance(Locale.US);
        String num3 = nf2.format(5000000);
        System.out.println(num3);
    }
}
