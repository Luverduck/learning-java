package part_01.chapter_11.s11_08.t08_02;

public class MyThreadStartSynchronizedBlock {
    public static void main(String[] args) {

        // MyClass의 인스턴스 생성
        MyClass myClass = new MyClass();
        // MyClass의 인스턴스 필드의 초기값 지정
        myClass.setField(3000);

        // 3개의 스레드로 MyClass의 인스턴스 필드 변경
        Thread thr1 = new Thread( new MyRunnableImpl("🔴 Thread_1", 500, myClass) );
        Thread thr2 = new Thread( new MyRunnableImpl("🟢 Thread_2", 300, myClass) );
        Thread thr3 = new Thread( new MyRunnableImpl("🔵 Thread_3", 400, myClass) );
        thr1.start();
        thr2.start();
        thr3.start();

    }
}
