class GM{
    static void geon(){
        System.out.println("Mai hu ek udtha robot...");
    }
}





public class Oops2 {
    String name;
     static void getdata(){   // if these methods are non static.. then we should have created object for them in main...
        System.out.println("Hello  viperr");
    }
   static void hehe(){
        System.out.println("Psych!!!!.. Thats a wrong numberrrrr");
    }

    void chck(){
        System.out.println("For me , their struggle is real!!");
    }
    public static void main(String[] args) {
       getdata();
       hehe(); 
       Oops2 obj=new Oops2();
       obj.chck();
       GM.geon();
    }
}
