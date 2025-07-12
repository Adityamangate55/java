import java.util.*;
class base{
    int i;
}
class derived extends base{
    int i;
    derived(int a, int b)
    {
        super.i=a;
        i=b;
    }
    void display(){
        System.out.println("i="+super.i);
        System.out.println("i="+i);
    }
}
class supermembereg{
        public static void main(String args[]) {
        derived d = new derived(30,40);

    }
}