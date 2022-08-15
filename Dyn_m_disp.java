class A{
    void show(){
        System.out.println("A ka beta hu mai!!");
    }
}

class B extends A{
    void show(){
        System.out.println("B ka beta hu mai!!");
    }
}
class C extends A{
    void show(){
        System.out.println("C ka beta");
    }
}


public class Dyn_m_disp {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();
        A rf;
        rf=a;
        rf.show();
        rf=b;
        rf.show();
        rf=c;
        rf.show();
    }
}
