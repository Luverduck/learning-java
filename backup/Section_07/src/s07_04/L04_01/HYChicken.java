package s07_04.L04_01;

/**
 * this 키워드
 * 클래스로부터 생성된 인스턴스 자신을 가리키는 참조 변수
 * 'this' 키워드와 도트 연산자 '.'를 통해 인스턴스 자신의 멤버에 접근할 수 있다.
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
    HYChicken() {
        this.no = 0;
        this.location = "강남";
        System.out.printf("%s %s 본점 생성\n", brand, location);
    }
    // ⭐ 'this' 키워드와 도트 연산자 '.'를 통해 인스턴스의 필드임을 명시할 수 있다.
    HYChicken(int no, String location) {
        this.no = no;
        this.location = location;
        System.out.printf("%s %d호 %s점 생성\n", brand, no, location);
    }
    // ⭐ 'this' 키워드와 도트 연산자 '.'를 통해 인스턴스의 필드임을 명시할 수 있다.
    HYChicken(int no, String location, int chainSales) {
        this.no = no;
        this.location = location;
        this.chainSales = chainSales;
        System.out.printf("%s %d호 %s점 생성 (매출 : %d원)\n", brand, no, location, chainSales);
    }
}