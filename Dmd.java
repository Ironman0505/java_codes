class Parent{
    void mthd(){
        System.out.println("Mthd of parenttt");
    }
}

class Ch1 extends Parent{
    void mthd(){
        System.out.println("Mthd of Child 1");
    }
}

class Ch2 extends Parent{
    void mthd(){
        System.out.println("Mthd of Child 2");
    }
}

public class Dmd {
    public static void main(String[] args) {
        Parent obj=new Parent();
        obj.mthd();
        obj=new Ch1();
        obj.mthd();
        obj=new Ch2();
        obj.mthd();

    }
}
