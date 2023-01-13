package homwork.m01.day0104;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EC {
    private int no ;//주문번호
    private String orderDate;//주문일자
    private String product;//주문상품
    private String cardName;//카드명
    private String cardNo;//카드번호
    private int pay;//결제금액

    public EC(int no, String orderDate, String product, String cardName, String cardNo, int pay) {
        this.no = no;
        this.orderDate = orderDate;
        this.product = product;
        this.cardName = cardName;
        this.cardNo = cardNo;
        this.pay = pay;
    }

    public int getNo() { return no; }
    public String getOrderDate() { return orderDate; }
    public String getProduct() { return product; }
    public String getCardName() { return cardName; }
    public String getCardNo() { return cardNo; }
    public int getPay() { return pay; }
}

class EcUse{
    public static void main(String[] args) {
        Map<String,ArrayList<EC>> map = new HashMap<>();
        ArrayList<EC> lists = new ArrayList<>();
        lists.add(new EC(1234,"2023-01-04","하이트맥주","삼성","12345678901",55900));
        lists.add(new EC(2345,"2021-12-12","꼬깔콘","롯데","55555666662",23600));
        lists.add(new EC(3456,"2023-01-01","노트북","현대","33332222666",2600000));
        map.put("EC",lists);
        print(map);
    }
    public static void print(Map<String, ArrayList<EC>> maps){
        System.out.println("------------------------------------------------------------------------------------");
        System.out.printf("%s %5s %10s \t %s \t %s \t\t %s\n","주문번호","주문일자","주문상품","카드명","카드번호","결제금액");
        System.out.println("------------------------------------------------------------------------------------");
        ArrayList<EC> arrEc = maps.get("EC");
        for (int i = 0; i < arrEc.size(); i++) {
            System.out.printf("%s %13s %7s \t %s \t %s \t %s\n", arrEc.get(i).getNo(),arrEc.get(i).getOrderDate(),
                    arrEc.get(i).getProduct(),arrEc.get(i).getCardName(),
                    arrEc.get(i).getCardNo().replace(arrEc.get(i).getCardNo().substring(5,8),"****"),String.format("%,d",arrEc.get(i).getPay()));
        }
        System.out.println();
        for (EC list : arrEc){
            System.out.printf("%s %13s %7s \t %s \t %s \t %s\n", list.getNo(),list.getOrderDate(), list.getProduct(),list.getCardName(),
                    list.getCardNo().replace(list.getCardNo().substring(5,8),"****"),String.format("%,d",list.getPay()));
        }
    }
}