package homwork.m01.day0103;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Product {
    private String modelId;
    private String modelName;
    private String producer;
    private int price;
    private int volume;
    private int amount;

    public void input(Scanner sc){

        System.out.println("제품정보를 입력하세요 ");
        System.out.print("제품번호: ");
        modelId = sc.next();
        System.out.print("제품명: ");
        modelName = sc.next();
        System.out.print("제조사: ");
        producer = sc.next();
        System.out.print("단가: ");
        price = sc.nextInt();
        System.out.print("수량: ");
        volume = sc.nextInt();
        amount = price * volume + (price * (amount / 10));
    }

    public String getModelId() { return modelId; }
    public String getModelName() { return modelName; }
    public String getProducer() { return producer; }
    public int getPrice() { return price; }
    public int getVolume() { return volume; }
    public int getAmount() { return amount; }
}
class ProductUse{
    public static void print(List<Product> lists){
        System.out.println("======================================================");
        System.out.println("제품번호 \t 제품명 \t 제조사 \t 단가(천원) \t 수량 \t 금액");
        for (Product list : lists){
            System.out.printf("%s \t\t %s \t %s \t %,d \t\t %,d \t\t %,d\n",list.getModelId(),list.getModelName(),list.getProducer()
            ,list.getPrice(),list.getVolume(),list.getAmount());
        }
    }

    public static void main(String[] args){
        boolean run = true;
        List<Product> lists = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (run){
            Product p1 = new Product();
            p1.input(sc);
            lists.add(p1);
            System.out.print("계속할거면 아무키나 누르세요 / 0 입력 시 종료 : ");
            String a = sc.next();
            if (a.equals("0")){
                break;
            }
        }sc.close();
        print(lists);

    }
}