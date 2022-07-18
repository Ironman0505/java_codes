class Outer{
int a=33;
String s="Habibi";
class Inner{
    void show(){
        System.out.println("The data of outer is "+a + " and name is "+s);
    }
}
}



public class Nstdc3 {
    public static void main(String[] args) {
        Outer obj=new Outer();
        Outer.Inner ob=obj.new Inner();
        ob.show();
    }
}
