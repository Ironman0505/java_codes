import java.util.Scanner;

public class Palin {
    public static void main(String[] args) {
        System.out.print("Enter the name: ");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        Boolean flg=false;
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)==s.charAt(n-i-1)){
                continue;
            }
            else{
                flg=true;
                break;
            }
        }
        if(!flg){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Non pLind");
        }
    }
}
