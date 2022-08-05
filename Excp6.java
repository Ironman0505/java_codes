public class Excp6 {
        public static void main(String[] args) {
           int a=10,b=3;
           try{
            int div=a/b;
            System.out.println("Value is "+div);
           }
           catch(Exception e){
            e.printStackTrace();
            System.out.println(e);
           }
           finally{
            System.out.println("I am always there to get executed");
           }
        }
    }

