class Main{
    Main(){
        System.out.println("Im inn");
    }
    Main(int a,int b){
        System.out.println(a+" "+b);
    }
  int val=58;
}

class Neeche extends Main{
int val=33;
Neeche(){
    super(20,40);
}
void show(){
  
    System.out.println(val+" "+super.val);
}
}





public class Spr {
   public static void main(String[] args) {
    new Neeche().show();
   } 
}
