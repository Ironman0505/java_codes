public class Nstdc8 {
    static Integer vall=3356;
   static String s=new String("Istyleee");
   static class Inner{
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
        Inner n= new Inner();
        n.show();
        copyright();
        System.out.println("The value of static var is "+vall);
    }
}
