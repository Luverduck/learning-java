package s10_02.L02_01;

public class Main {
    public static void main(String[] args) {
        // ✅ 레코드의 필드는 생성자를 통해 최초 1회만 초기화되며 값을 변경할 수 없다.
        MyRecord myRecord = new MyRecord(10, "이름");
        // ✅ 레코드 생성시 필드명과 같은 이름의 getter 메소드가 자동으로 생성된다.
        int fieldInt = myRecord.rFieldInt();
        String fieldString = myRecord.rFieldStr();
        // ✅ 레코드는 메소드를 가질 수 있다.
        myRecord.rMethod();
        // ✅ 레코드는 정적 필드와 정적 메소드를 가질 수 있다.
        int classField = MyRecord.rFieldStatic;
        MyRecord.rMethodStatic();
    }
}
