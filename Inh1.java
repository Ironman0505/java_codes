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
    void m(){
        System.out.println("sample");
    }
    
}

public class Inh1 {
    public static void main(String[] args) {
        B obj=new B();
        obj.mthd();
        A o=new A();  // of parent
       o.mthd();
       o=new B();  // can be used on child....
       o.mthd();
//    ob.m();         // this gives error... same method hai tho it works
    }
}
