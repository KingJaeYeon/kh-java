package homwork.m12.day1228;

class Pa3 {
    String name = "홍길동";
    String email = "hong@gmail.com";
    String id = "10";
    public void print() {
        System.out.println("사번 : " + id);
        System.out.println("이름 : " + name);
        System.out.println("이메일 : " + email);
    }
}

class Ch3 extends Pa3 {
    String hp = "010-1234-5678";
    String address = "서울 강남구 역삼동";

    @Override
    public void print() {
        super.print();
        System.out.println("전화 : " + hp);
        System.out.println("주소 :"+address);
    }
}

public class Poly3 {
    public static void main(String[] args) {
        Pa3 c = new Ch3();//다형성
        c.print();//자식쪽 print()호출
    }
}
