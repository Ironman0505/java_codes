class C1{
void chck(){
    System.out.println("This is C1");

}
}

class C2 extends C1{
void dc(){
    System.out.println("Roger that c2");
}
}


public class Inh2 {
    public static void main(String[] args) {
        C2 obj = new C2();
        obj.chck();
        obj.dc();
        
    }
}
