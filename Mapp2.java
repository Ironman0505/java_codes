
// import java.util.Map.Entry;
import java.util.*;


public class Mapp2 extends Collections {
    Mapp2(){
     HashMap<Integer,String> m=new HashMap<>();
     m.put(33,"tp");
     m.put(58,"phenoms");
     m.put(20,"meher");
     System.out.println("Map is "+m);
     Collection<String> x=m.values();
     System.out.println(x);
    Set<Integer> st= m.keySet();
    Set<Map.Entry<Integer,String>> y=m.entrySet();
System.out.println(y);

System.out.println();
// Enumeration<Integer> e= Collections.enumeration(m);
// System.out.println(e);
// System.out.println();
// while(e.hasMoreElements()){
//     System.out.println(e.nextElement());
// }

    }
    public static void main(String[] args) {
        new Mapp2();
    }
}
