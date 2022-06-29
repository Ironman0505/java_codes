import java.lang.Thread;


// MAIN THREAD AND ITS OPERATIONS

public class Thrd1 {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println("Name of the thread is : "+t);
        t.setName("WizzardDD");
        System.out.println("And here comes the "+t);
        System.out.println("The ID of "+t+" is "+t.getId());
        try{
            for(int i=5;i>=0;i--){
                System.out.println("val is "+i);
                Thread.sleep(1000);
                // t.sleep(1000);
            }
        }
        catch(InterruptedException e){
        System.out.println("MAinnnn thread interrupted  "+e);
        }
    }
}
