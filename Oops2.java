public class Oops2 {
    String name;
     static void getdata(){   // if these methods are non static.. then we should have created object for them in main...
        System.out.println("Hello  viperr");
    }
   static void hehe(){
        System.out.println("Psych!!!!.. Thats a wrong numberrrrr");
    }
    public static void main(String[] args) {
       getdata();
       hehe(); 
    }
}
