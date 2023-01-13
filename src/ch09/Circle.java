package ch09;

import ch08.Book;

public class Circle {
    //Constructor
    public Circle(){}
    public Circle(int r){
        System.out.println("반지름: "+ r);
    }

    private void secret(){
        System.out.println("비밀이다");
    }
    protected void findRadius(){
        System.out.println("반지름 구하기");
    }
    public void findArea(){
        System.out.println("넓이 구하기");
    }
    public void run(){
        System.out.println("원 : ");
        secret();
        findRadius();
        findArea();
    }
}
class Ball extends Circle{
    private String color;
    //Constructor
    public Ball(){}
    public Ball(String color){
        this.color = color;
    }

    public void findColor(){
        System.out.println(color + "공이다");
    }
    public void findVolume(){
        System.out.println("부피 구하기기");
   }
   @Override
    public void run(){
       System.out.println("공 :");
        findColor();
        findVolume();
        findRadius();
        findArea();
   }
}
class InheritanceEx{
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Ball b1 = new Ball("red");
        c1.run();
        System.out.println("=======================");;
        b1.run();

    }
}