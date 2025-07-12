import java.util.*;
class compar_two {
    public static void main(String args[]){
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the values of a");
        a=s.nextInt();
        System.out.println("Enter the values of b");
        b=s.nextInt();

        if(a>b){
            System.out.println("a is largest");
        }
        else{
            System.out.println("b is largest");
        }
    }
}
