package part_01.chapter_15.s15_07.t07_03;

public class MyClassGeneric<T> {

    // 필드 (Field)
    private T value;

    // 메소드 (Method)
    T getValue() {
        return this.value;
    }

    // 생성자 (Constructor)
    MyClassGeneric(T value) {
        this.value = value;
    }

}
