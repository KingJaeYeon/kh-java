package ch16;

public class ThreadJoin extends Thread{
    //join() : join 메소드를 호출한 스레드가 종료될 때까지 현재의 스레드를 대기시킴
    public static void main(String[] args) {
        String trd =Thread.currentThread().getName();
        System.out.println(trd+"스레드가 시작되었습니다.");
        ThreadJoin e = new ThreadJoin();
        e.setName("스레드1");
        e.start();
        try {
            e.join();
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        System.out.println(trd+"스레드가 종료되었습니다.");
    }
    @Override
    public void run(){
        String trd =Thread.currentThread().getName();
        System.out.println(trd+"스레드가 시작되었습니다.");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(trd+"스레드가 종료되었습니다.");
    }
}
