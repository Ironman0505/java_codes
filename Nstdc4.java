class Out{
  private String s="My Love!";
    class In{
      String s2="is myself..";
      void show(){
        System.out.println(s+ " "+s2);
      }
    }
    void magic(){
     In in=new In();
     in.show();
    }
}




public class Nstdc4 {
    public static void main(String[] args) {
        Out o=new Out();
        o.magic();
    }
}
