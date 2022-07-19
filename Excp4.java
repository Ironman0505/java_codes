import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Excp4 {
    public static void main(String[] args)  {
        InputStreamReader is =new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(is);
       try{ 
        br.readLine();
       }
       catch(Exception e){
        System.out.println(e);
       }
    }
}





///// you can fcuking use try catch blocks just to avoid throws..hehe intelligent


// upar waale ka sastha notion...but it still gives errros..isliye throws is legit

// public static void main(String[] args) throws Exception  {
//     InputStreamReader is =new InputStreamReader(System.in);
//     BufferedReader br=new BufferedReader(is);
//    br.readLine();

// }
