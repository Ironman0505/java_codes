
class C1{
    C1(){
        System.out.println("Def const");
    }
    C1(int a){
    System.out.println("para Constructor of c1");
    }
}

class C2 extends C1{
    C2(){
        System.out.println("Cons of c2");
    }
    C2(int a){
        super(33);  // if this is cmnted..def const of c1 is called by def
        System.out.println("param of c2");
    }
}


public class Inh3 {
    public static void main(String[] args) {
        new C2();
        new C2(66);
    }
}
