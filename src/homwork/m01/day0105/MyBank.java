package homwork.m01.day0105;

public class MyBank {
    StringBuilder sb = new StringBuilder().append("000님의 통장잔고는 %d만원 입니다.\n");
    public synchronized void print(int balance,String name) {
        sb.replace(0,3,name);
        for (int i = 0; i < 5; i++){
            System.out.printf(sb.toString(),balance);
            balance += 10;
        }
        System.out.println();
    }
}

class BankPlayer extends Thread {
    String name;
    MyBank myBank;
    int balance;

    public BankPlayer(String name, MyBank myBank) {
        setName(name);
        this.name = name;
        this.myBank = myBank;
        switch (name){
            case "홍길동":
                balance = 10;
                break;
            case "사임당":
                balance = 20;
                break;
            case "이몽룡":
                balance = 30;
        }
    }
    @Override
    public void run() {
        myBank.print(balance,name);
    }
}

class BankUse {
    public static void main(String[] args) throws InterruptedException {
        MyBank myBank = new MyBank();
        BankPlayer hong = new BankPlayer("홍길동", myBank);
        BankPlayer sa = new BankPlayer("사임당", myBank);
        BankPlayer lee = new BankPlayer("이몽룡", myBank);

        hong.start();
        hong.join();
        sa.start();
        sa.join();
        lee.start();
        lee.join();
    }
}