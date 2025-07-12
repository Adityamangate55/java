import java.util.*;

class swap_nv{
    public static void main(String args[]){
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value in a");
        a=s.nextInt();
        System.out.println("Enter the value in b");
        b=s.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}