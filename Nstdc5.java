
// static classes can access only static variables n members... 

class Out{
    static int val=33;
         static String s1="How are you ?";
    static class In{

        String s=" chayaa ";

        void show(){
       System.out.println("Hello"+s+val+"... "+s1);   // eventhough i take s1,val from up...out ka object isnt needed... In tho andhar ki hi hai na..
        }

    }
}



public class Nstdc5 {
    public static void main(String[] args) {
        // Out o=new Out();   // iska kaam hi nahi hai
        Out.In obj= new Out.In();
        obj.show();
    }
}
