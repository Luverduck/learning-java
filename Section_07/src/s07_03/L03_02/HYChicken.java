package s07_03.L03_02;

/**
 * 기본 생성자 (Default Constructor)
 * 매개변수가 없는 생성자를 기본 생성자(Default Constructor)라 한다.
 * 기본 생성자는 인스턴스 필드의 값을 자료형의 기본값으로 초기화한다.
 * 기본 생성자는 명시적으로 정의하지 않아도 인스턴스 생성시 호출할 수 있다.
 */

public class HYChicken {
    // 필드 (Field)
    final String    brand = "HY치킨";
    int             no;
    String          location;
    int             chainSales;

    // 메소드 (Method)
    void intro() {
        System.out.printf("%s %d호 %s점 입니다.\n", brand, no, location);
    }

    // ✅ 생성자 (Constructor)
    /*HYChicken(int pNo, String pLocation, int pChainSales) {
        no = pNo;
        location = pLocation;
        chainSales = pChainSales;
        System.out.printf("%s %d호 %s점 생성 (매출 : %d원)\n", brand, no, location, chainSales);
    }*/
    HYChicken() {
        System.out.println("HY치킨 생성");
    }
}