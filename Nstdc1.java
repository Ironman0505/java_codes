
/// GFG  REFERENCE

//static neested clss..
class Outer{

    void mtt(){
        System.out.println("Outer...");
    }
    // its also a member of Outer cls
    static class Inner{
        void mt(){
            System.out.println("STATIC Inner mthd");
        }
        static void play(){
            System.out.println("Mere liye obj bhi nahi chahiye");
        }  //  --- chck this out
    }
}


public class Nstdc1 {
    public static void main(String[] args) {
        Outer ot=new Outer();
        ot.mtt();
        Outer.Inner obj= new Outer.Inner(); // no need of creating an object of the outer cls..(coz.. static)
        obj.mt();
        // Inner.play();
        Outer.Inner.play();
    }
}
