

class MyThread extends Thread{
Thread t;
String sname;
 MyThread(String sname){
    super(sname);
  this.sname=sname;
  System.out.println("The thread is : "+sname);
  System.out.println("Lets start itt");
  start();
  // try{
  //     start();
  // }
  // catch(Exception e){
  //     System.out.println("I am the error "+e);
  // }
//   
 }
 public void run(){
     System.out.println("The run of thread is initiated");
     for(int i=3;i>=0;i--){
         System.out.println(" the val is "+i);
         try{
         Thread.sleep(1000);
         }
         catch(Exception e){
             System.out.println("eRROR CAUGHTYYY");
         }
     }
 }

}



public class Thrd2 {
   public static void main(String[] args) {
    //    MyThread mt=new MyThread("Viperr");
    new MyThread("Viperr");
    //    mt.start();
   } 
}
