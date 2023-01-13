package homwork.m12.day1222;

class Person {
    private String name;
    private int age;
    private String e_mail;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showInfo() {
        System.out.println("이름:" + name);
        System.out.println("나이:" + age);
        System.out.println("이메일:" + e_mail);
        System.out.println("주소:" + address);
    }
}

public class PersonUse2 {
    public static void main(String[] args) {
        Person hong = new Person();
        hong.setName("홍길동");
        hong.setAge(30);
        hong.setE_mail("hong@naver.com");
        hong.setAddress("서울 강남구 역삼동");
        hong.showInfo();

        System.out.println();
        Person sa = new Person();
        sa.setName("사임당");
        sa.setAge(25);
        sa.setE_mail("saimdang@gmail.com");
        sa.setAddress("서울 강남구 개포동");
        sa.showInfo();
    }
}
