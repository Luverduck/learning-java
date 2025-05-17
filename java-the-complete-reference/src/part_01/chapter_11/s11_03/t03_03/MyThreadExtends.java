package part_01.chapter_11.s11_03.t03_03;

public class MyThreadExtends extends Thread {

    @Override
    public void run() {
        for(int i = 0; i < 5; ++i)
            System.out.println("[%s] : %c".formatted(Thread.currentThread().getName(), (char)('A' + i)));
    }

}
