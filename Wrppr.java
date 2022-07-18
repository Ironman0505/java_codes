import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Wrppr {
    public static void main(String[] args) throws IOException {

        System.out.print("enter a name : ");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(is);
        String s = bf.readLine();
      
        System.out.print("enter a val : ");
        // try{
        int num=Integer.parseInt(bf.readLine());
        // }
        // catch()
        System.out.println("The num is "+num);
        System.out.println("The name is : "+s);
        Boolean a =false;
        // Integer x=33;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : " );
        Integer x=sc.nextInt();
        if(a==false)
        System.out.println("A is falsee");
        else
        System.out.println("A is true");
        System.out.println("The num is "+x);

    }
}
