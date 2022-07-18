class Demo{
    int a,b;
    Demo(){
        System.out.println("Default constructor...");
    }
    Demo(int a,int b){
        this();
        this.a=a;
        this.b=b;
       
    }
    void sum(){
        int sm=a+b;
        System.out.println("sum is "+sm);
    }
}

class Rthis{
    int prdt,a,b;
    Rthis(){
        System.out.println("Default const..");
    }
   Rthis mthd(int a,int b){
    this.a=a;
    this.b=b;
    return this;
    }
   
    void pd(){
        // this(); // this() method can be called only inside a constructor
        System.out.println("Product is "+a*b);
    }
}


public class This1 {
    public static void main(String[] args) {
        
    Demo obj=new Demo(20,30);
    obj.sum();

    Rthis vpr=new Rthis();
    vpr.mthd(33,7).pd();
    }
 
   
}
