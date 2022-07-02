import javax.xml.crypto.KeySelector.Purpose;

class Oops{
  protected  String nm;   //pvt hua tho other classes cant take..only within class
    Oops(){
        System.out.println("Hello world!!");
        nm="Viperr";
    }

  void get(){
        System.out.println("Name is "+nm);
    }
}

public class Oops1 {
    public static void main(String[] args) {
    Oops obj=new Oops();
    obj.get();
    System.out.println(obj.nm);
    }
}
