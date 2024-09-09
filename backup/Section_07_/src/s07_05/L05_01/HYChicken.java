package s07_05.L05_01;

/**
 * 클래스 멤버 (Class Member)
 * 클래스 안에 'static' 키워드로 정의된 변수와 함수를 의미한다.
 * - 클래스 필드(Class Field)
 * - 클래스 메소드(Class Method)
 *
 * 클래스 필드 (Class Field)
 * 클래스 안에 'static' 키워드로 정의된 변수(Variable)
 * 클래스로부터 생성된 모든 객체가 공유할 상태를 저장한다.
 * 클래스 필드는 명시적 초기화 또는 static 초기화 블럭을 통해 초기화된다.
 * ⭐ 필드의 상수화
 * - 필드를 'static final'로 선언하면 클래스 로드 시점에 최초 1회 초기화되며 프로그램이 끝날 때까지 값을 변경할 수 없는 상수가 된다.
 *
 * 클래스 메소드 (Class Method)
 * 클래스 안에 'static' 키워드로 정의된 함수(Function)
 * 클래스의 정적 필드를 조작하거나 클래스 단위에서 특정 기능을 수행한다.
 * 메소드 오버로딩(Method Overloading)을 통해 같은 이름의 정적 메소드를 중복 정의할 수 있다.
 * ⭐ 클래스 메소드의 특징
 * 1) 클래스 메소드는 인스턴스를 생성하지 않고도 클래스만으로 호출할 수 있다.
 * 2) 클래스 메소드 안에서 인스턴스의 필드에 직접 접근할 수 없다.
 *    클래스 메소드 안에서 특정 인스턴스의 멤버의 접근은 해당 인스턴스를 참조해야 한다.
 * 3) 클래스 메소드 안에서 다음 키워드는 사용할 수 없다.
 *    - this  : 클래스의 인스턴스 자신을 가리키는 참조 변수
 *    - super : 부모 클래스를 가리키는 참조 변수
 */

public class HYChicken {
    // 인스턴스 필드 (Instance Field)
    final String    brand = "HY치킨";
    int             no;
    String          location;
    int             chainSales;
    // ✅ 클래스 필드 (Class Field)
    static int      chainCount = 0;
    static int      totalSales;
    static {
        totalSales = 0;
    }
    // ⭐ 필드의 상수화
    static final String     group = "HY그룹";

    // 인스턴스 메소드 (Instance Method)
    void intro() {
        System.out.printf("%s %d호 %s점 입니다.\n", brand, no, location);
    }
    void sale(int price) {
        totalSales += price;
        System.out.printf("%s %d호 %s점 판매 : %d원\n", brand, no, location, price);
    }
    // ✅ 클래스 메소드 (Class Method)
    static void totalSales() {
        System.out.printf("%s 총 매출 : %d원\n", group, totalSales);
    }
    // ⭐ 클래스 메소드 안에서 특정 인스턴스의 멤버에 접근하기 위해서는 해당 인스턴스를 참조해야 한다.
    static void chainSales(HYChicken chain) {
        System.out.printf("%s %d호 %s점 매출 : %d원\n", chain.brand, chain.no, chain.location, chain.chainSales);
    }

    // 생성자 (Constructor)
    HYChicken(String location) {
        chainCount++;
        this.no = chainCount;
        this.location = location;
        System.out.printf("%s %d호 %s점 생성\n", brand, no, location);
    }
}