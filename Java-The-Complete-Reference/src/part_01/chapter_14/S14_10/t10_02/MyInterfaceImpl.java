package part_01.chapter_14.S14_10.t10_02;

public class MyInterfaceImpl implements MyInterfaceGeneric<String> {

    @Override
    public String method(String param) {
        System.out.println("String param = " + param);
        return param;
    }

}
