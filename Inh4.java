interface C1{
  void m();
}
interface C2{
void m();
}

class C3 implements C1,C2{
public void m(){
    System.out.println("mine");
}
}

public class Inh4 {
    public static void main(String[] args) {
        C3 obj=new C3();
        obj.m();
    }
}
