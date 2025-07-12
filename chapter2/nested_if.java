import java.util.*;
public class nested_if
{
    public static void main (String args[]){
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Marks");
        n=obj.nextInt();
        if(n<0||n>100)
            System.out.println("Invalid Marks");
        else if(n<=20)
            System.out.println("you need dijitize");
        else if(n<=40)
            System.out.println("D Grade");
        else if(n<=60)
            System.out.println("C Grade");
        else if(n<=80)
            System.out.println("B Grade");
        else if(n<=90)
            System.out.println("A Grade");
        else if(n<=99)
            System.out.println("A+ Grade");
    }
}