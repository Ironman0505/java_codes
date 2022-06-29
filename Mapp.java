import java.util.*;

public class Mapp {
    public static void main(String[] args) {
        // Map<Integer,Character> mp= new HashMap<Integer,Character>();
        // int a=97;
        // char ch=(char)a;
        // for(int i=1;i<5;i++)
        // mp.put(i,ch++);
        // System.out.println(mp);
        Map<Integer,String> mp= new HashMap<Integer,String>();
        int k=1;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<3;i++){
  System.out.print("Enter the name of Student "+k+": ");
 
  String name= sc.nextLine();
//   System.out.println();
  mp.put(k++,name);
        }

        Set<Integer> keys= mp.keySet();
        for(Integer key : keys)
        System.out.println("Key : " + key+" Value : "+mp.get(key));
        sc.close();
        // char a='A';
        // System.out.println(a);
        // System.out.println(++a);
        
    }
    
}
