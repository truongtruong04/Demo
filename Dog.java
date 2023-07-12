public class Dog  extends Animal {
    void run(){
        System.out.println("chạy ngay đi ");
    }
    public static void main(String [] args ){
        Animal obj = new Dog();
        obj.run();
    }
}
