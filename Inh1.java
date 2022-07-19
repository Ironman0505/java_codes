class A{
    int a=33;
    void mthd(){
        System.out.println("Mthd of A");
    }
}
class B extends A{
    void mthd(){
        System.out.println("I am heroo B");
        
    }
    
}

public class Inh1 {
    public static void main(String[] args) {
        B obj=new B();
        obj.mthd();
        A o=new B();
       o.mthd();
    }
}
