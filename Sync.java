class Apple { 
    synchronized public void getApple() { 
        for (int i = 0; i < 3; i++) { 
            System.out.println(i); 
            try { 
                Thread.sleep(400); 
            } 
            catch (Exception e) { 
                System.out.println(e); 
            } 
        } 
    } 
} 
  
class Tree extends Thread { 
   
    Apple apple; 
  
    Tree (Apple apple) { 
        this.apple = apple; 
    } 
  
    @Override
    public void run() { 
        apple.getApple(); 
    } 
} 
  
public class Sync { 
    public static void main(String[] args) { 
     
        Apple obj = new Apple(); //Object of Apple class that is shared amoung threads
  
        Tree tree1 = new Tree(obj); 
        Tree tree2 = new Tree(obj); 
  
        tree1.start(); 
        tree2.start(); 
    } 
} 