package homwork.m01.day0105;

public class MyThread_Ex extends Thread{

    public MyThread_Ex(String name){
        setName(name);
    }

    @Override
    public void run(){
        Thread thread = Thread.currentThread();
        for (int i = 1 ; i<=5 ; i++){
            System.out.println(thread.getName()+" ==> "+i);
        }
    }

}

class MyThread_Ex_Use {
    public static void main(String[] args) throws InterruptedException {
        MyThread_Ex thread1 = new MyThread_Ex("스레드1");
        MyThread_Ex thread2 = new MyThread_Ex("스레드2");
        Thread highThead, lowThead;

        thread1.setPriority(10);
        thread2.setPriority(5);
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