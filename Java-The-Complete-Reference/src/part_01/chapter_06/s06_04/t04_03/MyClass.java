package part_01.chapter_06.s06_04.t04_03;

public class MyClass {

    // 필드 (Field)
    int iField;
    double fField;
    boolean bField;
    char cField;
    String sField;

    // 생성자 (Constructor)
    MyClass(int iParam, double fParam, boolean bParam, char cParam, String sParam) {
        System.out.println("생성자 호출");
        this.iField = iParam;
        this.fField = fParam;
        this.bField = bParam;
        this.cField = cParam;
        this.sField = sParam;
    }

}
