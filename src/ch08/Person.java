package ch08;

public class Person {
    private String name;
    private int height;
    private int weight;

    public Person() {
        this("홍길동",170,60);
    }

    public Person(String name) {
        this(name,190,100);
    }

    public Person(String name, int height) {
        this(name,height,70);
    }

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void showInfo(){
        System.out.println("==신상정보==");
        System.out.printf("이름: %s\n",name);
        System.out.printf("키: %d\n",height);
        System.out.printf("몸무게: %d\n\n",weight);
    }
}
class PersonUse{
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.showInfo();

        Person p2 = new Person("추신수");
        p2.showInfo();
    }
}
