class VyperExc extends Exception{
    VyperExc(String s){
        super(s);
    }

}


public class Excp5 {
    public static void main(String[] args) {
        try{
            throw new VyperExc("Mera naya created exception...");
        }
        catch(VyperExc obj){
            System.out.println(obj);
        }
    }
}
