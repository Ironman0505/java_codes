import java.io.StringBufferInputStream;

class Lava extends Exception{
    Lava(String s){
        super(s);
    }
}



public class Prctc {
 

 public static void main(String[] args) {
    try{
        throw new Lava("My strength");
    }
    catch(Lava lv){
        lv.printStackTrace();
        System.out.println(lv);
    }
 }
}
