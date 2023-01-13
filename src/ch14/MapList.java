package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student{
    private String name;
    private String num;
    private String major;
    private int year;
    private String professor;

    public Student(String name, String num, String major, int year, String professor) {
        this.name = name;
        this.num = num;
        this.major = major;
        this.year = year;
        this.professor = professor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
}

public class MapList {
    public static void print(Map<String, Object> map) {
        ArrayList<Student> list2 = (ArrayList<Student>) map.get("list");
        for (Student s: list2){
            System.out.printf("%s \t %s \t %s \t %s \t %s\n",s.getNum(),s.getName(),s.getMajor(),s.getYear(),s.getProfessor());
        }
    }

    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>(); //맵 인스턴스
        List<Student> list = new ArrayList<>(); //라스트 인스턴스
        list.add(new Student("202301","kim","전산",1,"park"));
        list.add(new Student("202201","hong","영문",2,"sam"));
        list.add(new Student("202101","lee","경제",3,"lunk"));
        map.put("list",list);
        print(map);
    }
}
