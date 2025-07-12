import java.util.*;

class swap{
    public static void main(String args[]){
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value in a");
        a=s.nextInt();
        System.out.println("Enter the value in b");
        b=s.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}