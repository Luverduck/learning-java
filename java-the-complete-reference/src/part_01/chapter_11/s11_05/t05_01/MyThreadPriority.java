package part_01.chapter_11.s11_05.t05_01;

public class MyThreadPriority {
    public static void main(String[] args) {

        // 스레드 클래스의 인스턴스 생성
        Thread myThread1 = new Thread(new MyThread());
        myThread1.setName("myThread_1");
        Thread myThread2 = new Thread(new MyThread());
        myThread2.setName("myThread_2");
        Thread myThread3 = new Thread(new MyThread());
        myThread3.setName("myThread_3");

        // 스레드 우선순위 설정
        myThread1.setPriority(Thread.MAX_PRIORITY);
        myThread2.setPriority(Thread.NORM_PRIORITY);
        myThread3.setPriority(Thread.MIN_PRIORITY);

        // 스레드 생성
        myThread1.start();
        myThread2.start();
        myThread3.start();

    }
}
