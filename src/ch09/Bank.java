package ch09;

public class Bank {
    double getInterestRate(){
        return 0.0;
    }
}
class BadBank extends Bank{
    //@ : 어노테이션(Annotation)이라고 하며 컴파일러에게 추가적인 정보르 제공하는 메타데이터로
    //주석으로 활용하거나 또는 프로그램에게 특정기능을 정의하거나 실행하도록 정보 제공
    //스프링에서는 본격적으로 활용한다.
    @Override
    double getInterestRate() {
        return 10.0;
    }
}
class NormalBank extends Bank{
    @Override
    double getInterestRate() {
        return 5.0;
    }
}
class GoodBank extends Bank{
    @Override
    double getInterestRate() {
        return 3.0;
    }
}
class BankTest{
    public static void main(String[] args) {
        BadBank b1 = new BadBank();
        NormalBank n1 = new NormalBank();
        GoodBank g1 = new GoodBank();
        System.out.println("BadBank 의 이자율: "+String.format("%.1f%%",b1.getInterestRate()));
        System.out.println("NormalBank 의 이자율: "+String.format("%.1f%%",n1.getInterestRate()));
        System.out.println("GoodBank 의 이자율: "+String.format("%.1f%%",g1.getInterestRate()));
    }
}
