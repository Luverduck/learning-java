package s07_03.L03_03;

/**
 * 생성자 오버로딩(Constructor Overloading)
 * 매개변수 리스트를 다르게 하여 생성자를 중복 정의할 수 있다.
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

    // 생성자 (Constructor)
    // ✅ 생성자 오버로딩
    HYChicken() {
        no = 0;
        location = "강남";
        System.out.printf("%s %s 본점 생성\n", brand, location);
    }
    // ✅ 생성자 오버로딩
    HYChicken(int pNo, String pLocation) {
        no = pNo;
        this.location = pLocation;
        System.out.printf("%s %d호 %s점 생성\n", brand, no, location);
    }
    // ✅ 생성자 오버로딩
    HYChicken(int pNo, String pLocation, int pChainSales) {
        no = pNo;
        location = pLocation;
        chainSales = pChainSales;
        System.out.printf("%s %d호 %s점 생성 (매출 : %d원)\n", brand, no, location, chainSales);
    }
}