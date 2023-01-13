package homwork.m12.day1226;

public class Student {
    private String name;
    private String num;
    private String major;
    private int year;

    public Student(){}

    public Student(String name, String num, String major, int year) {
        super();
        this.name = name;
        this.num = num;
        this.major = major;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getNum() {
        return num;
    }

    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    //상속관계의 클래스들에서는 생성보다는 메소드를 잘 활용한다.
    public void input(String name, String num, String major, int year) {
        this.name = name;
        this.num = num;
        this.major = major;
        this.year = year;
    }
}
class Scholar extends Student{
    private String category;
    private int money;

    public void input(String name, String num, String major, int year, String category, int money) {
        super.input(name, num, major, year);
        this.category = category;
        this.money = money;
        //super() -> 부모클래스이 생성자 호출, 주의점 : 첫째줄에서 정의
        //super. -> 부모클래스의 변수, 메소드 호출
        //this() -> 현재 클래스의 다른 생성자 호출
        //this. -> 현재 클래스의 변수, 메소드 호출
    }
    public void print() {
        System.out.println("이름 \t 학번 \t 전공 \t 학년 \t 구분 \t 장학금액");
        System.out.println(getName()+" \t "+getNum()+" \t "+getMajor()+" \t "+getYear()+"     \t "+category+" \t "+money);
    }
    public void print2() {
        System.out.println("이름 \t 학번 \t 전공 \t 학년");
        System.out.println(getName()+" \t "+getNum()+" \t "+getMajor()+" \t "+getYear());
    }
}
class ScholarUse{
    public static void main(String[] args) {
        Scholar  s1 = new Scholar();
        //1. 부모클래스인 Student 객체가 생성
        //2. Student 생성자 호출
        //3. Scholar 객체가 생성
        //4. Scholar 생성자 호출
        s1.input("김철수", "2201", "컴공", 1, "1종", 2500000);
        s1.print();
        s1.input("홍길동", "2103", "전자", 3); //자식에게 가서 없으면 부모클래스로 찾아감.
        s1.print2();

    }
}