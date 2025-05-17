package part_01.chapter_15.s15_06.t06_03;

public class MyClass {

    // ...

    // 메소드 (Method)
    // 인스턴스 메소드 (비정적 메소드)
    <T> int countingValue(T[] values, T target) {
        int count = 0;
        for(int i = 0; i < values.length; ++i)
            if(values[i] == target) count++;
        return count;
    }

    // 클래스 메소드 (정적 메소드)
    static <T> int countingValueStatic(T[] values, T target) {
        int count = 0;
        for(int i = 0; i < values.length; ++i)
            if(values[i] == target) count++;
        return count;
    }

}
