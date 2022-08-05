interface Dragon{
   public abstract void attack();
}
interface Wiz{
   public abstract void blast();
}

class Clash implements Dragon,Wiz{
public  void attack(){
        System.out.println("ATTACK INITIATEDDD!!!");
    }
  public  void blast(){
        System.out.println("Blast INITIATEDDD!!!");
    }
}
class Royale implements Wiz{
    public void blast(){
System.out.println("Blast.. boom");
    }
}

public class Interface1 {

    public static void main(String args[]){
    Clash c =new Clash();
    c.attack();
    c.blast();
    }
}
