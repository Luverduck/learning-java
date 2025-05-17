package part_01.chapter_11.s11_04.t04_01;

public class MyThreadSleep {
    public static void main(String[] args) {

        // 스레드 클래스의 인스턴스 생성
        Thread myThread = new Thread(new MyThread());

        // 스레드 생성
        myThread.start();

    }
}
