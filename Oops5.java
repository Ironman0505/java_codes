
// static stuff dekhne ke liye....

class Stat{
    Stat(){
        System.out.println("Constructor method called");
    }
    static{
        System.out.println("Its a static method...");
    }
}


public class Oops5 {
    public static void main(String[] args) {
    Stat s=new Stat();
    Stat p= new Stat();
    Stat q= new Stat();
    }
}
