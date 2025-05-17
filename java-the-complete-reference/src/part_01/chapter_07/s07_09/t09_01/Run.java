package part_01.chapter_07.s07_09.t09_01;

public class Run {
    public static void main(String[] args) {
        
        // 명령줄 인수 출력
        System.out.println("명령줄 인수 : %d개".formatted(args.length));
        if(args.length != 0)
            for(var str : args)
                System.out.println(str);
        else
            System.out.println("없음");

    }
}
