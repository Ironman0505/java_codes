
// array of objcts...
class Chck{
    // Chck(String s){
    //     System.out.println(s);
    // }
    Chck(){
        System.out.println("2nd type of checkk");
    }
    static void stmeth(){   // static method usage
        System.out.println("Static methodd");
    }
}



public class Oops4 {
    public static void main(String[] args) {
        Chck[] c =new Chck[4];
        c[0] = new Chck();
        // c[0]=new Chck("Zapp");    // uncomment this and try parametrised cons 
        Chck.stmeth();
    }
}
