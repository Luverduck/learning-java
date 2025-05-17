package part_01.chapter_11.s11_03.t03_03;

public class MyThreadImplements implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 5; ++i)
            System.out.println("[%s] : %d".formatted(Thread.currentThread().getName(), i));
    }

}