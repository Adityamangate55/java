import java.util.*;
class tables{
    public static void main (String args[])
    {
        int i,a,ans,ans1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value");
        a=s.nextInt();
        for(i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                ans1=i*j;
                System.out.print("\t"+ans1);
            }
            ans=i*i;
            System.out.println("\t"+ans);
        }
    }
}