
// Local inner class

class Outer{
    int y=66;
    void getin(){
        class Inner{
            int x=33;
            void show(){
                System.out.println("The nums are "+y+" "+x);
            }
        }
       Inner obj=new Inner();
       obj.show();
    }
static void hhh(){
System.out.println("Static hu bhai...");
}
}


public class Nstdc9 {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.getin();
        Outer.hhh();
    }
}
