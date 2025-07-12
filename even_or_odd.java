import java.util.*;
class even_or_odd {
    public static void main(String args[]){
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the values");
        a=s.nextInt();
        b=a%2;
        if(b==0){
            System.out.println("The values is even");
        }
        if(b!=0){
            System.out.println("The values is odd");
        }
    }
}
