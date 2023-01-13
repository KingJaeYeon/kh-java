package ch08;

public class Calculator {
    private int left;
    private int right;

    public Calculator() {
        System.out.println("기본 생성자 호출...");
    }

    public Calculator(int left, int right) {
        System.out.println("매개변수가 있는 생성자 호출...");
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(left+right);
    }
    public void avg(){
        System.out.println((left+right)/2);
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }
}
class CalculatorUse{
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setLeft(10);
        c1.setRight(20);

        System.out.println(c1.getLeft());
        System.out.println(c1.getRight());
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator(10,20);
        c2.sum();
        c2.avg();
    }
}
