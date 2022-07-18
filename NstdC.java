class Arena{
    class Common{

    void wiz(){
        String card= "Wizard";
        System.out.println("Wizard is hereee "+card);
    }

    }
    protected class Legendary{
        void lava(){
            String card="Inferno Dragon";
            System.out.println("Lava hound is hereee "+card);
        }
    }
}


public class NstdC {
    public static void main(String[] args) {
        Arena ar=new Arena();
        Arena.Common cm = ar.new Common();
        cm.wiz();
        Arena.Legendary lg=ar.new Legendary();
        lg.lava();
    }
}
