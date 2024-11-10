package part_01.chapter_11.s11_08.t08_01;

public class MyRunnableImpl implements Runnable {

    // 필드 (Field)
    String threadName;
    private int change;
    private MyClass myClass;

    // 생성자 (Constructor)
    public MyRunnableImpl(String threadName, int change, MyClass myClass) {
        this.threadName = threadName;
        this.change = change;
        this.myClass = myClass;
    }

    // 메소드
    @Override
    public void run() {
        while(myClass.getField() > this.change) {
            myClass.voidMethodChangeField(this.threadName, this.change);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
