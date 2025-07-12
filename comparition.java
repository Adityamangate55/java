import java.util.*;
class comparition {
    public static void main(String args[]){
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the values of a");
        a=s.nextInt();
        System.out.println("Enter the values of b");
        b=s.nextInt();

        if(a>b){
            System.out.println("b is smallest");
        }
        if(b>a){
            System.out.println("a is smallest");
        }
    }
}
