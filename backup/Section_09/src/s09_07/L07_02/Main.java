package s09_07.L07_02;

// 패키지 임포트 (Package Import)
// `import`문은 컴파일 단계에서 컴파일러가 참조할 패키지 멤버의 위치를 명시한다.
// `import`문을 통해 클래스에서 특정 패키지의 멤버 또는 패키지 전체를 참조할 수 있다.
// `import`문은 `.`를 기준으로 왼쪽에 상위 패키지, 오른쪽에 하위 패키지를 의미한다.
// `import`문에서 특정 패키지 전체를 참조할 때 `패키지명.*`를 사용한다.

// ✅ s09_05.L05_01.mypackage에 있는 클래스 MyClass를 읽어오는 경우
import s09_07.L07_02.mypackage.MyClass;
// ✅ s09_05.L05_01.mypackage에 있는 인터페이스 MyInterface를 읽어오는 경우
import s09_07.L07_02.mypackage.MyInterface;
// ✅ s09_05.L05_01.mypackage에 있는 서브 패키지 mysubpackage의 모든 멤버를 읽어오는 경우
// ✅ s09_05.L05_01.mypackage에 있는 모든 클래스와 인터페이스를 읽어오는 경우


public class Main {
    public static void main(String[] args) {
        MyClass myClass;
        MyInterface myInterface;
    }
}
