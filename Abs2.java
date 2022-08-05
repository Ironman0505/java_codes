abstract class Zap{
    Zap(){
        System.out.println("I am constructor of the abstrct clss");
    }
    abstract void show();
}

public class Abs2 extends Zap{
    void show(){
        System.out.println("I am Thanos");

    }
    public static void main(String[] args) {
        new Abs2().show();
    }
}
