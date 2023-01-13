package ch14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMember {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();
        Member m1 = new Member();
        m1.setName("김정수");
        m1.setUserId("Kim");
        m1.setPassword("1234");
        m1.setTel("02-123-4567");
        m1.setEmail("we@gmail.com");
        //객체자료를 ArrayList에 담는 방법
        //[1] 방법
        list.add(m1); // ArrayList 에 Member 객체를 1개 추가
        System.out.println(list.size());
        //[2] 방법
        Member m2 = new Member("hong","홀길동","1234","010-1234-5555","hong@gmail.com");
        list.add(m2);
        System.out.println(list.size());
        //[3] 방법
        list.add(new Member("chu","추길동","1234","010-1234-5555","chu@gmail.com"));

        System.out.println("이름 \t 아이디 \t 비번 \t 전화 \t 이메일");
        for (int i = 0 ; i<list.size();i++){
            Member m = list.get(i);
            System.out.printf("%s \t %s \t %s \t %s \t %s\n",m.getUserId(),m.getName(),m.getPassword(),m.getTel(),m.getEmail());
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("이름 \t 아이디 \t 비번 \t 전화 \t\t\t 이메일");
        for(Member m : list){
            System.out.printf("%s \t %s \t %s \t %s \t %s\n",m.getUserId(),m.getName(),m.getPassword(),m.getTel(),m.getEmail());
        }
    }
}
