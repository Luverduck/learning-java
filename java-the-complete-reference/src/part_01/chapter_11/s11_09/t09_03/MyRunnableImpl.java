package part_01.chapter_11.s11_09.t09_03;

public class MyRunnableImpl implements Runnable {

    // 필드 (Field)
    public String threadName;
    public MyClass myClass;

    // 생성자 (Constructor)
    public MyRunnableImpl(String threadName, MyClass myClass) {
        this.threadName = threadName;
        this.myClass = myClass;
    }

    // 메소드
    @Override
    public void run() {
        while(true) {
            myClass.vMethod(this.threadName);
        }
    }

}
