
interface A{
    static void disp(){
        System.out.println("I am static brother... i will have bodyyy");
    }
    static final int val=33;
    void show();
}
class B implements A{
   public void show(){
        System.out.println("My body is written here...");
    }
    void hero(){
        System.out.println("Make him laughhhh");
    }
}






public class Intrfce1 {
    public static void main(String[] args) {
        B obj=new B();
        A.disp();
        obj.show();
        obj.hero();
        System.out.println("static val is "+A.val);
    }
}
