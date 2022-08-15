import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.*;
public class Stoken {
    public static void main(String[] args) {
        String s="Hello this is viper here";
        StringTokenizer st=new StringTokenizer(s); //def is space...  
        // StringTokenizer st=new StringTokenizer(s,"i");  
        ArrayList<String>ls=new ArrayList<>();
        while(st.hasMoreTokens())
        {
            String x=st.nextToken();
            System.out.println(x);
            ls.add(x);
            // System.out.println("Remaining tokens "+st.countTokens());
        }
    
      for(String str : ls){
        System.out.print(str+" ");
      }
    }
}
