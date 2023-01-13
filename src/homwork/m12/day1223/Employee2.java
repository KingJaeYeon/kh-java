package homwork.m12.day1223;

public class Employee2 {
    private String name;
    private String part;
    private String position;
    private int basic;
    private int bonus;
    private int total;
    private int tax;
    private int salary;

    public void input(String name, String part, String position, int basic) {
        this.name = name;
        this.part = part;
        this.position = position;
        this.basic = basic;
    }

    public void calc() {
        bonus = basic * 3;
        total = basic + bonus;
        tax = (int) (total * 0.033);
        salary = total - tax;
    }

    @Override
    public String toString() {
        String str = "이름 부서 직위 기본급 보너스 총액 세액 실수령액\n";
        str += String.format("%s %s %s %d %d %d %d %d",name,part,position,basic,bonus,total,tax,salary);
        return str;
    }
}

class EmployeeUse2 {
    public static void main(String[] args) {
        Employee2 employee = new Employee2();
        employee.input("김철수","관리부","과장",300);
        employee.calc();
        System.out.println(employee);
    }
}
