package s07_03.L03_01;

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
    HYChicken() {
        this.no = 0;
        this.location = "강남";
        System.out.printf("%s %s 본점 생성\n", brand, location);
    }
}