

class Zap{
    void create(){
        try{
            throw new ArithmeticException();
        }
        catch(ArithmeticException ar){
            ar.printStackTrace();
        }
    }
}


public class Excp3 {
    public static void main(String[] args) {
        (new Zap()).create();
    }
}
