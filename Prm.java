import java.util.Scanner;


public class Prm {

    static String ch(char ...ch){
         String ans="";
         for(char i:ch)
         ans+=i;
         return ans;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   System.out.println(ch('h','e','l','l','o'));
 }   
 static boolean pr(int num){
     int cnt=0;
     for(int i=1;i<=num;i++){
        if(num%i==0)
        cnt+=1;
     }
   return cnt==2;
 }
}
