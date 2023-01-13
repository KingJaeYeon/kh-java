package homwork.m12.day1229;

public class MemberOuter {
    int customerID = 1;
    class TestInner{
        String name = "홍길동";
        String email = "hong@gmail.com";

        void print(){
            System.out.println("-----------------------");
            System.out.println("고객번호: "+ customerID);
            System.out.println("이름: "+ name);
            System.out.println("이메일: "+email);
            System.out.println("-----------------------");
        }
    }
    void useTestInner(){
        TestInner testInner = new TestInner();
        testInner.print();
    }
}
class Test{
    public static void main(String[] args) {
        MemberOuter mo = new MemberOuter();
        mo.useTestInner();
    }
}