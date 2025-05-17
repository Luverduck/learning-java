package part_01.chapter_09.s09_03.t03_01;

// 패키지 임포트 (Package Import)
import part_01.chapter_09.s09_03.t03_01.mypackage_lv1.MyClassOther11;  // 특정 클래스
import part_01.chapter_09.s09_03.t03_01.mypackage_lv1.mypackage_lv2.*; // 패키지 전체

public class ImportingPackage {

    // 패키지 임포트 (Package Import)
    public static void main(String[] args) {
        // 패키지 안의 특정 클래스 참조
        MyClassOther11 mo11 = new MyClassOther11();
        // MyClassOther12 mo12 = new MyClassOther12(); // import되지 않은 클래스
        // 패키지 안의 모든 클래스 참조
        MyClassOther21 mo21 = new MyClassOther21();
        MyClassOther22 mo22 = new MyClassOther22();
    }

}