import java.util.Scanner;

class Str1{
    public static void main(String[] args) {

// String a="fdvkj" (or) String a=new String("vkjkbfekj");

        Scanner sc=new Scanner(System.in);
        String taken= sc.nextLine();   // next() vaadthe it wont take whole set of words...
        System.out.println("The taken stuff is "+ taken);
        String s="Wizzarddd";
        System.out.println(s.length());
        for(int i=0;i<s.length();i++)
        System.out.print(s.charAt(i)+" ");
        System.out.println();
        String sub=s.substring(2, 6);
        System.out.println(sub);
        String chck="Hello World";
        if(chck.contains("orl")){
            System.out.println("I do have..");
        }
        else System.out.println("I dont haveee");

        // =s.subSequence(3, 6);
        // System.out.println(sub2);
    }
}