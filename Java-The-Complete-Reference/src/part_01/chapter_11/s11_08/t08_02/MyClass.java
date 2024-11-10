package part_01.chapter_11.s11_08.t08_02;

import java.util.Random;

public class MyClass {

    // 필드 (Field)
    private int field;

    // 메소드 (Method)
    public int getField() {
        return field;
    }
    public void setField(int intField) {
        this.field = intField;
    }

    void vMethodChangeField(String threadName, int change) {

        synchronized(this) {
            if(field < change) return;
            System.out.println("[%s] 메소드 호출 intField : %d".formatted(threadName, field));
            try {
                Thread.sleep(new Random().nextInt(700, 1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            field -= change;
            System.out.println("[%s] 메소드 종료 intField : %d".formatted(threadName, field));
        }
    }

}
