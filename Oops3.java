class Zap{
    int id;
    int sal;
    String nm;
     void show(){
        System.out.println("id : "+id+" sal : "+sal + " nm "+nm);
     }
}


public class Oops3 {
    public static void main(String[] args) {
        Zap wiz=new Zap();
        wiz.id=33;
        wiz.nm="Viperr";
        wiz.sal=1234;
        wiz.show();
    }


}
