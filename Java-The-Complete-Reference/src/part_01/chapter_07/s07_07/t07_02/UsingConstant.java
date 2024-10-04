package part_01.chapter_07.s07_07.t07_02;

public class UsingConstant {

    public static void main(String[] args) {

        // 상수는 모든 클래스에서 인스턴스 생성 없이 접근할 수 있도록 public static final로 선언한다.
        double radius = 15.0;
        double Area = 4 * MyConstant.PI * Math.pow(radius, 2);
        double Volume = (4 * MyConstant.PI * Math.pow(radius, 3) / 3);

    }
}
