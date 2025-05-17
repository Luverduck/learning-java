package part_01.chapter_11.s11_09.t09_03;

public class MyThreadStartNotWait {
    public static void main(String[] args) {

        // MyClass의 인스턴스 생성
        MyClass myClass = new MyClass();

        // 3개의 스레드로 MyClass의 인스턴스 필드 변경
        Thread thr1 = new Thread( new MyRunnableImpl("🔴 Thread_1", myClass) );
        Thread thr2 = new Thread( new MyRunnableImpl("🟢 Thread_2", myClass) );
        Thread thr3 = new Thread( new MyRunnableImpl("🔵 Thread_3", myClass) );
        thr1.start();
        thr2.start();
        thr3.start();

    }
}
