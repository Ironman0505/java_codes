//  class with atleast one abstract method is abstract classss

abstract class Global{
    abstract void status();
    abstract void rank();
    abstract void legend();
}

// If the Child class is unable to provide implementation to all 
// abstract methods of the Parent class then we should declare that Child class as abstract 
// so that the next level Child class should provide implementation to the remaining abstract method.

abstract class India extends Global{
    void legend(){
        System.out.println("Ratan Tata is the godd");
    }
    void status(){
        System.out.println("Legendary country");
    }
}
 class Telangana extends India{
 void rank(){
    System.out.println("We give our own ranks pall...");
 }
 }

public class Oops6 {
    public static void main(String[] args) {
  Telangana ts= new Telangana();
  ts.status();
  ts.rank();
  ts.legend();
    }
}
