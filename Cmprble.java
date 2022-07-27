import java.util.*;
import java.io.*;
class Card implements Comparable<Card>{
    int arena;
    String name;
    int dmg;
    Card(int arena,String name,int dmg){
this.arena=arena;
this.name=name;
this.dmg=dmg;
    }

    @Override
    public int compareTo(Card c) {
        if(this.dmg < c.dmg)
        return 1;
        else return -1;
    }
   
   
}

public class Cmprble extends Collections {
 public static void main(String[] args) {
    Card c1=new Card(3, "one", 33);
    Card c2=new Card(3, "one", 66);
    Card c3=new Card(3, "one", 633);
    Card c4=new Card(3, "one", 383);
    Card c5=new Card(3, "one", 335);
    ArrayList<Card> lc=new ArrayList<Card>();
    lc.add(c1);
    lc.add(c2);
    lc.add(c3);
    lc.add(c4);
    lc.add(c5);
    Collections.sort(lc);
    for(Card m:lc){
     System.out.println(m.dmg+" "+m.name+" "+m.arena);
    }

 }   
}
