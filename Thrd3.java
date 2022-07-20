
class Viper implements Runnable{
Thread t;
String name="THoRr";

Viper(){
    System.out.println("I am Inevitable...");
    System.out.println("And i am "+name);
    t= new Thread(this,"Zappp");
    t.start();
}
public void run(){
try{
    for(int i=3;i>0;i--)
    {
        System.out.println(" SNap by Thorr inn "+i);
        Thread.sleep(1133);
    }
}
catch(Exception e){
    System.out.println("I am exception "+e);
}
}

}



public class Thrd3 {
    public static void main(String[] args) {

        new Viper();
        Thread t=Thread.currentThread();
        System.out.println("Name of the thread is : "+t);
        t.setName("WizzardDD");
        System.out.println("And here comes the "+t);
        System.out.println("The ID of "+t+" is "+t.getId());
        try{
            for(int i=5;i>=0;i--){
                System.out.println("val of main is "+i);
                Thread.sleep(1000);
                // t.sleep(1000);
            }
        }
        catch(InterruptedException e){
        System.out.println("MAinnnn thread interrupted  "+e);
        }
    }
}
