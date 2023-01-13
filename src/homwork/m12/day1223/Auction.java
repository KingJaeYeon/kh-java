package homwork.m12.day1223;

public class Auction {
    private String name;
    private String userId;
    private int money;
    private String grade;

    public void input(String name, String userId, int money) {
        this.name = name;
        this.userId = userId;
        this.money = money;
        this.grade = setGrade();
    }
    private String setGrade(){
        if (money>=100000)
            return "Gold";
        return  "Silver";
    }
    public void showInfo(){
        System.out.println("이름     아이디    구매금액    등급");
        System.out.printf("%s %7s %,10d %6s\n",name,userId,money,grade);
    }
}
class AuctionUse{
    public static void main(String[] args) {
        Auction auction = new Auction();
        auction.input("홍길동","hong",150000);
        auction.showInfo();
    }
}
