package ch15;

public class Priority extends Thread{
    public static void main(String[] args) {
        Priority e1 = new Priority();
        Priority e2 = new Priority();

        e1.setName("스레드1");
        e2.setName("스레드2");

        e1.setPriority(1);
        e2.setPriority(2);

        System.out.println("e1의 기본 우선순위: "+e1.getPriority());
        System.out.println("e2의 기본 우선 순위: "+e2.getPriority());

        e1.start();
        e2.start();
    }
    @Override
    public void run(){
        for (int i = 0 ; i < 10 ;i++){
            System.out.println(Thread.currentThread().getName()+", "+i);
        }
    }
}
