package s07_03.L03_01;

/**
 * 생성자 (Constructor)
 * 클래스 안에 정의된 함수(Function) 중 하나로, 클래스로부터 객체를 생성할 때 호출된다.
 * 생성자는 클래스의 이름과 일치하며 반환형을 명시하지 않는다.
 * 또한 return 문이 없어도 해당 클래스 자료형의 인스턴스를 반환한다.
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
    HYChicken(int pNo, String pLocation, int pChainSales) {
        no = pNo;
        location = pLocation;
        chainSales = pChainSales;
        System.out.printf("%s %d호 %s점 생성 (매출 : %d원)\n", brand, no, location, chainSales);
    }
}