import java.util.*;
class temp_convertion{
    public static void main(String args[]) 
    {
        int a,f;
        double avg;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the temp");
        f=s.nextInt();
        a=(5/9)*(f-32);
        System.out.println("temp in f is "+a);
    }
}