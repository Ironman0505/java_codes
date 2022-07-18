


class Out{
    static int val=33;
         static String s1="How are you ?";
    static class In{

        String s=" chayaa ";
        
        void show(){
       System.out.println("Hello"+s+val+"... "+s1);
        }

    }
    void disp(){
        In obj=new In();
        obj.show();
    }
}



public class Nstdc6 {
    public static void main(String[] args) {
        Out o=new Out();  
        o.disp();
    }
}
