public class Excp2 {
    public static void main(String[] args) {
        int a=33;
        // int b=0;
        int b=1;
        int ar[]={1,2,3,4};
        
        try{
            int sol=a/b;
            System.out.println("Value is "+sol);
             ar[5]=30;
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
