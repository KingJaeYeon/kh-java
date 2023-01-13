package ch06;

public class SalaryEx {
    //전역변수(멤버변수)는 어디에서나 사용되어지며 값들이 기억되어진다.
    static String[] name = {"박과장", "김과장", "이대리", "최주임", "홍실장" };
    static int[] salary = {2800, 3000, 2500, 2000, 3500};
    static int[] bonus = new int[5];
    static int[] total = new int[5];
    static int[] tax = new int[5];
    static int[] pay = new int[5];
    static int pay_tot;//총지급액

    static void calc() {
        for (int i = 0; i < name.length; i++) {
            bonus[i] = (int) (salary[i] * 0.3);
            total[i] = bonus[i] + salary[i];
            tax[i] = (int) (total[i] * 0.03);
            pay[i] = total[i] - tax[i];
            pay_tot += pay[i];
        }
    }
    static void print(){
        System.out.println("이름 \t 연봉 \t 보너스 \t 총액 \t 세금 \t 실수령액");
        for (int i = 0 ; i<name.length ;i++){
            System.out.println(name[i]+" \t "+salary[i]+" \t "+bonus[i]+" \t "+
                    total[i]+" \t "+tax[i]+" \t "+pay[i]);
        }
        System.out.println("총지금액의 합계:"+pay_tot);
        System.out.println("총지급액의 평균:"+pay_tot/name.length);
    }

    public static void main(String[] args) {
        calc();
        print();
    }
}
