abstract class Mthd{
    abstract void fn();
    void lulu(){
        System.out.println("I am mthd in abstrat class");
    }
}

class M1 extends Mthd{

    void fn(){
        System.out.println("M1 ka creation...");
    }
}

class M2 extends Mthd{
    void fn(){
        System.out.println("M2 ka creation...");
    }
}


public class Abs1 {
    public static void main(String[] args) {
        Mthd obj=new M1();
        obj.lulu();
        obj.fn();
        obj=new M2();
        obj.lulu();
        obj.fn();
    }
}
