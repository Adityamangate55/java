import java.util.*;
class A extends Thread{
    public void run(){
        System.out.println("Good");
    }
}
class B extends Thread{
    public void run(){
        System.out.println("Morning");
    }
}
class C extends Thread{
    public void run(){
        System.out.println("Students");
    }
}
class threadeg{
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();
        a.setPriority(Thread.MIN_PRIORITY);
        b.setPriority(Thread.NORM_PRIORITY);
        c.setPriority(Thread.MAX_PRIORITY);
        a.start();
        b.start();
        c.start();
    }
}