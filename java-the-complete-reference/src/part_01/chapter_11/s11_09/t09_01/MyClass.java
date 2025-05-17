package part_01.chapter_11.s11_09.t09_01;

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

        // MyClass 객체에 접근 대기 중인 스레드 중 하나의 대기 상태를 해제한다.
        notify();

        // 현재 객체의 락(Lock)을 가진 스레드의 모니터 객체를 해제한 후 대기 상태로 만든다.
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
