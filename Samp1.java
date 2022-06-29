public class Samp1 {
    int a;
    String s;
    Samp1(){
        System.out.println("constructor calleddd");
        a=33;
        s="Vyperrr";
    }
    Samp1(int a, String s){
        this();
        this.a=a;
        this.s=s;
        
    }
    void display(){
        System.out.println("The int value is "+a+" and name is "+s);
    }
    public static void main( String args[]){
        new Samp1().display();
        Samp1 s2= new Samp1(56," kowshik");
        // s.display();
        s2.display();
    }
}
