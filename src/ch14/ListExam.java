package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        //ArrayList<Object> list = new ArrayList<>();
        List<Object> list = new ArrayList<>(); //실무형 코드(다형성 기법);
        list.add("하나");
        list.add(2);
        list.add(5.5);
        list.add(false);
        list.add(2);

        for(Object a : list){
            System.out.println(a);
        }
    }
}
