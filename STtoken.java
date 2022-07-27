
import java.util.*;
public class STtoken {
    public static void main(String[] args) {
        String s="Hello this is viper here!!";
        StringTokenizer st=new StringTokenizer(s); //def is space...  
        // StringTokenizer st=new StringTokenizer(s,"i");  
        ArrayList<String>ls=new ArrayList<String>();
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
            ls.add(st.nextToken());
            // System.out.println("Remaining tokens "+st.countTokens());
        }
    // int [] ar=new int[5];
    Collections.sort(ls);
    
        for(String str : ls){
        System.out.print(str+" ");
      }
    }
}
