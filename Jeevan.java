import java.util.*;
public class Jeevan {
    public static void main(String[] args) {
        Map<String,Integer> mp=new HashMap<String,Integer>();
        Scanner sc=new Scanner(System.in);
        int n=4;
        for(int i=0;i<4;i++){
            System.out.println("Enter name : ");
            String s=sc.nextLine();
            System.out.println("Enter val : ");
            int m=sc.nextInt();
            mp.put(s,m);
            sc.nextLine();
        }
        System.out.println(mp);
    }
}
