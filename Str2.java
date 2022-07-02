import java.util.Scanner;

import java.lang.*;

public class Str2 {
    // StringBuilder class usageee
    public static void main(String[] args) {
        System.out.print("Enter string : ");

Scanner sc= new Scanner(System.in);

String name=sc.nextLine();
System.out.println();
        StringBuilder sb=new StringBuilder(name);
       
        System.out.println("The string is "+sb);
        sb.append(" world");
        System.out.println("after changes "+sb);
        sb.insert(3,'c');
        sb.delete(5,8);
        sb.setCharAt(0, 'P');
        System.out.println("after changes "+sb);
        sc.close();
    }
}
