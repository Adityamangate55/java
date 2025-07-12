import java.util.*;
class A{
    int a,b,c;
    void get()
    {
        System.out.println("Enter two value of a");
    }
}
class B extends A{
    void get()
    {
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;
        System.out.println("Enter two value of c is"+c);
    }
}

class addition{
    public static void main(String args[])
    {
        A a=new A();
        B b=new B();
        A ref;
        ref=a;
        ref.get();
        b.get();
    }
}
