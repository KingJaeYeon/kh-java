package ch13;

import java.util.Calendar;


public class Cal {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH) + 1); //월은 0~11 리턴해서 +1해야함
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.HOUR)); //12시간제
        System.out.println(cal.get(Calendar.HOUR_OF_DAY)); //24시간제
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));

        String amPm = cal.get(Calendar.AM_PM) == Calendar.AM ? "오전" : "오후";
        System.out.println(amPm); //오전 0 , 오후 1
        //1년 중에 몇번째 날
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        //월의 몇번째 날
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        //요일(일요일 1~ 토요일 7)- Java에선 숫자코드까지만 세공된다.
        String yoil = "";
        switch (cal.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                yoil = "SUNDAY";
                break;
            case 2:
                yoil = "MONDAY";
                break;
            case 3:
                yoil = "TUESDAY";
                break;
            case 4:
                yoil = "WEDNESDAY";
                break;
            case 5:
                yoil = "THURSDAY";
                break;
            case 6:
                yoil = "FRIDAY";
                break;
            case 7:
                yoil = "SATURDAY";
                break;
        }
        System.out.println("오늘은 " + yoil + "입니다.");
        System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
    }
}
