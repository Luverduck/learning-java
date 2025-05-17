package part_01.chapter_14.s14_11.t11_02;

public class MyInterfaceImpl implements MyInterfaceGeneric<String> {

    @Override
    public String method(String param) {
        System.out.println("String param = " + param);
        return param;
    }

}
