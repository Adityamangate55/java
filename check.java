import java.util.*;
class check {
    public static void main(String args[]){
        char a;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values of a");
        a=s.next().charAt(0);
        if(a>=65 && a<=90)
            System.out.println("it is Capitual alphabete");
        else if(a>=97 && a<=122)
            System.out.println("it is small alphabete");
        else if(a>=48 && a<=57)
            System.out.println("it is digit");
        else 
            System.out.println("symbals");
    }
}