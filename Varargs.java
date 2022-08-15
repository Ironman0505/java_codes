public class Varargs {
    static void fn(int ...a){
int sum=0;
System.out.println("Length of var arg is "+a.length);
for(int i:a){
    sum+=i;
}
System.out.println("The sum is "+sum);
    }

    static void fn2(int x,int ...a){
        System.out.println("Length of var arg is "+a.length);
        int sum=0;
        for(int i:a){
            sum+=i;
        }
        sum-=x;
        System.out.println("The sum is "+sum);
    }
    public static void main(String[] args) {
        fn(1,2,3,4,5,6);
        fn(1,2,3,4);
        fn2(10,11,12,13,15,16);
    }
}
