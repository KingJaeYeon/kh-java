package homwork.m01.day0105;

public class MyThread_Im implements Runnable{

    @Override
    public void run(){
        Thread thread = Thread.currentThread();
        for (int i = 1 ; i<=5 ; i++){
            System.out.println(thread.getName()+" ==> "+i);
        }
    }

}

class MyThread_Im_Use {
    public static void main(String[] args) throws InterruptedException {
        MyThread_Ex thread1 = new MyThread_Ex("스레드1");
        MyThread_Ex thread2 = new MyThread_Ex("스레드2");
        Thread highThead, lowThead;

        thread1.setPriority(3);
        thread2.setPriority(6);
        if (thread1.getPriority()>thread2.getPriority()){
            highThead = thread1;
            lowThead = thread2;
        }
        else {
            highThead = thread2;
            lowThead = thread1;
        }
        highThead.start();
        highThead.join();
        lowThead.start();


    }
}