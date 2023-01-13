package ch16;

public class YieldExam implements Runnable{
    @Override
    public void run() {
        for (int i = 0 ; i<5;i++){
            System.out.println("run()에서 실행되는 스레드");
        }
    }

    public static void main(String[] args) {
        Thread r = new Thread(new YieldExam());
        r.start();
        for (int i = 0 ; i<5;i++){
            if (i==3){
                //실행대기상태로 전환되면서 다른 스레드에게 실행을 양보
                Thread.yield();
            }
            System.out.println("main 스레드");
        }
    }
}
