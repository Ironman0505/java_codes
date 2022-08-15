import java.util.Scanner;

public class Srtd_names {
    public static void main(String[] args) {
        System.out.print("Enter the number of names : ");
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         System.out.println("Enter "+n+" names : ");
         String s[] = new String[n];
         for(int i=0;i<n;i++){
            s[i]=sc.next(); //single word input
            
         }
         for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(s[i].compareTo(s[j])>0){
                    String tmp=s[i];
                    s[i]=s[j];
                    s[j]=tmp;
                }
            }
         }
         for(int i=0;i<n;i++){
            System.out.print(s[i]+" ");
         }
         sc.close();
    }
}
