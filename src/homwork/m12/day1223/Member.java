package homwork.m12.day1223;

public class Member {
    private String name;
    private String userId;
    private int price;
    private String grade;

    Member() {
        this("김철수", "kim", 50000);
    }

    Member(String name, String userId, int price) {
        this.name = name;
        this.userId = userId;
        this.price = price;
        grade = setGrade();
    }
    private String setGrade(){
        if (price>=100000)
            return "Gold";
        return "Silver";
    }
    public void showInfo(){
        System.out.println("이름    아이디    구매금액    등급");
        System.out.printf("%s %5s %,10d %9s\n",name,userId,price,grade);
    }
}
class MemberUse{
    public static void main(String[] args) {
        Member member = new Member();
        member.showInfo();
    }
}
