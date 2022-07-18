/// GFG  REFERENCE

class Outer{

    void mtt(){
        System.out.println("Outer...");
    }
    // its also a member of Outer cls
    class Inner{
        void mt(){
            System.out.println(" Inner class mthd");
        }
    }
}


public class Nstdc2 {
    public static void main(String[] args) {
        Outer ot=new Outer();
        ot.mtt();
       Outer.Inner obj = ot.new Inner();
       obj.mt();
    }
}
