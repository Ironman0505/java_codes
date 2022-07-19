public class Excp1 {
    public static void main(String[] args) {
        int a=33,b=1; 
        // int b=0;
        try{
    
           // ---- apna haath ka magicc
            if(b==1){
                throw new NullPointerException() ;  // you are throwing with your fcuking handd
            }
            // ----------
            int sol=a/b;

            System.out.println("value is "+a/b);
        }
        catch(NullPointerException e){
            System.out.println(e);
            e.printStackTrace();
        }

        catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
            e.toString();
        }
    
    }
}
