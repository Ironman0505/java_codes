import java.util.Scanner;

class MyThread extends Thread{
    String str="Zapp";
    Thread t;
    MyThread(){
       System.out.println("The Thread name is"+str);
       System.out.println("Started Running");
       start();
    }
    public void run(){
     try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name pal");
        String name=sc.nextLine();
        System.out.println("The Scanner data Taken isss "+name);
        sc.close();
     }
     catch(Exception e){
        System.out.println("Exception occured");
     }
     
    }
}


public class Thrd4 {
 
    public static void main(String[] args) {
        System.out.println("Main Thread starteddd");
    new MyThread();
    Thread myt=Thread.currentThread();
    myt.setName("pss pss");
    try{
     for(int i=0;i<10;i++){
        System.out.println("Hello Worlddd!!");
        Thread.sleep(750);
     }
    }
    catch(Exception e){
        System.out.println("Exception occured");
     }
    }
}
