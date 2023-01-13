package homwork.m12.day1230;

public interface Member {
    void showInfo();
}

class MemberAnony {
    Member member;

    public void showInfo(Member member) {
        member.showInfo();
    }

    public static void main(String[] args) {
        MemberAnony memberAnony = new MemberAnony();
        memberAnony.showInfo(new Member() {
            String customerId = "2";
            String name = "김길동";
            String email = "kim@gmail.com";

            @Override
            public void showInfo() {
                System.out.println("===========================");
                System.out.println("고객번호: " + customerId);
                System.out.println("이름: " + name);
                System.out.println("이메일: " + email);
                System.out.println("===========================");
            }
        });
    }
}