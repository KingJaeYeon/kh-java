package ch08;

public class Book {
    private String bookName;
    private String author;
    private String press;
    private int year;
    private int price;
    private int amount;
    private int money;

    public Book() {
        this("자바","김선생","한빛",2020,25000,10);
        System.out.println("기본생성자 호출...");
    }

    public Book(String bookName, String author, String press,
                int year, int price, int amount) {
        System.out.println("매개변수가 있는 생성자 호출...");
        this.bookName = bookName;
        this.author = author;
        this.press = press;
        this.year = year;
        this.price = price;
        this.amount = amount;
        money = setMoney();
    }
    private int setMoney(){
        return price * amount;
    }

    public void print(){
        System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
        System.out.printf("%s %s %s %d %d %d %d\n",bookName,author,press,year,price,amount,money);
    }
}
class BookUse{
    public static void main(String[] args) {
        Book book = new Book();
        book.print();
    }
}
