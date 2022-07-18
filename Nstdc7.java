

public class Nstdc7 {

    String s=new String("Istyleee"); // if this was static.. it could have directly accessed into MAIN Mthd...


    class Inner{  // class is not static..but main is static.. soooo, to get this class.. we need its instance
                   // iski instance ke liye we should start from outer obj coz.. its obj is associated with outer obj
    int a=33;
    void show(){
        System.out.println("My "+s+" "+a);
    }
    }

   static void copyright(){
        // Inner n = new Inner();
        System.out.println("ALl rights reservedddd!!");
    }
    public static void main(String[] args) {
        Nstdc7 N=new Nstdc7();
        Nstdc7.Inner n= N.new Inner();
        n.show();
        copyright();
    }
}
