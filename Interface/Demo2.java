package Interface;

public class Demo2 {
    public static void main(String [] args ){
        Human blu = new Male();
        blu.draw();
        System.out.println("thích thì chơi ");
        Human fermale = new Female();
        fermale.draw();
    }
}
