package part_01.chapter_05.s05_02.t02_02;

public class IfElseIfLadder {
    public static void main(String[] args) {
        
        // if-else-if문
        int x = 5;
        int y = 3;

        if(x + y > 8)
        {
            System.out.println("A");
        }
        else if(x + y > 5)
        {
            System.out.println("B");
        }
        else
        {
            System.out.println("~A || ~B");
        }
        
    }
}
