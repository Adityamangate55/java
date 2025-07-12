import java.util.*;
class table{
    public static void main (String args[])
    {
        int i,a,ans;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value");
        a=s.nextInt();
        for(i=1;i<=10;i++){
            ans=i*a;
            System.out.println(ans);
        }
    }
}