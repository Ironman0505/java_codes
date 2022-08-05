import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Buffr {
    public static void main(String[] args) throws Exception {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(is);
        System.out.print("Enter a name : ");
        String s=bf.readLine();
        System.out.println("The name is "+s);
       int val= new Scanner(System.in).nextInt();
       System.out.println(val);

    }
}
