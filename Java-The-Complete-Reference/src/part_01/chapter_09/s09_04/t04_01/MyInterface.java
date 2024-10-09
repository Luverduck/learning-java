package part_01.chapter_09.s09_04.t04_01;

public interface MyInterface {

    // final 필드 (Final Field)
    String sFieldInterface = "MyInterface의 필드";
    static final String sFieldStaticFinal = "MyInterface의 필드";

    // 추상 메소드 (Abstract Method)
    void methodInterface();
    abstract void methodAbstract();

}
