package part_01.chapter_11.s11_09.t09_03;

public class MyClass {

    // 메소드 (Method)
    synchronized public void vMethod(String threadName) {
        System.out.println("[%s] 메소드 호출".formatted(threadName));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("[%s] 메소드 종료".formatted(threadName));
    }

}
