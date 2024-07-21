package s07_04.L04_01;

/**
 * 클래스 멤버의 접근
 * 클래스 멤버는 인스턴스 생성 없이 클래스만으로 접근할 수 있디.
 * 클래스 멤버는 클래스 로더에 의해 클래스가 메소드 영역에 로드될 때 함께 로드된다.
 * 즉, 클래스 필드와 클래스 메소드는 클래스의 인스턴스가 아닌 클래스 자체에 속해있다.
 * ⭐ 단, 클래스 메소드 안에서 인스턴스의 필드에 직접 접근할 수 없다.
 *    클래스 메소드 안에서 특정 인스턴스의 멤버의 접근은 해당 인스턴스를 참조해야 한다.
 */

public class Main {
    public static void main(String[] args) {
        // 클래스의 인스턴스 생성
        HYChicken chain1 = new HYChicken("강남");
        HYChicken chain2 = new HYChicken("잠실");
        HYChicken chain3 = new HYChicken("신림");
        // 인스턴스 멤버 접근
        chain1.sale(50000);
        chain2.sale(30000);
        chain3.sale(10000);
        // ✅ 클래스 멤버 접근
        int chainCount = HYChicken.chainCount;
        HYChicken.totalSales();
    }
}
