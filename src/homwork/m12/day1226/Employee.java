package homwork.m12.day1226;

public class Employee {
    private int num; //사번
    public String name; //이름
    public String address; //주소
    public String email; //이메일
    protected int salary; //월급
    private String rrn; //주민번호

    public Employee(int num, String name, String address, String email, int salary, String rrn) {
        this.num = num;
        this.name = name;
        this.address = address;
        this.email = email;
        this.salary = salary;
        this.rrn = rrn;
    }

    public void print() {
        System.out.println("==========================");
        System.out.println("사번 :" + num);
        System.out.println("이름 :" + name);
        System.out.println("주소 :" + address);
        System.out.println("이메일 :" + email);
        System.out.println("주민번호 :" + rrn);
        System.out.println("연봉 :" + salary);
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(int num, String name, String address, String email, int salary, String rrn) {
        super(num, name, address, email, salary, rrn);
        bonus = salary * 0.3;
    }

    public void changeSalary(int salary) {
        this.salary = salary;
        this.bonus = salary * 0.3;
    }

    public void print() {
        super.print();
        System.out.println("보너스 :" + bonus);
    }
}

class ManagerTest {
    public static void main(String[] args) {
        Manager manager = new Manager(1, "홍길동", "서울 강남구 역삼동",
                "hong@gmail.com", 3000, "123456-1234567");
        manager.print();
        manager.changeSalary(3500);
        manager.print();
    }
}