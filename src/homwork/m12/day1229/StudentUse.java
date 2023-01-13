package homwork.m12.day1229;

interface Student {
    void address(String name, int kor, int eng, int mat);
    void point(String name, String address, String email);
}

class Sinfo implements Student {
    @Override
    public void address(String name, int kor, int eng, int mat) {
        System.out.printf("%-5s %-4s %-4s %-4s %-4s %s\n","이름","국어","영어","수학","총점","평균");
        System.out.printf("%-5s %-5d %-5d %-5d %-5d %.1f\n",
                name,kor,eng,mat,(kor+eng+mat),(double)(kor+eng+mat)/3.0);
        System.out.println("========================================");
    }

    @Override
    public void point(String name, String address,String email) {
        System.out.println("========================================");
        System.out.printf("%-10s %-10s %s\n","이름","주소","이메일");
        System.out.printf("%-9s %-8s %s\n",name,address,email);
        System.out.println("----------------------------------------");
    }
}

public class StudentUse {
    public static void main(String[] args) {
        Student st = new Sinfo();
        st.point("홍길동","서울 강남구","hong@gmail.com");
        st.address("홍길동",90,85,79);
    }
}
