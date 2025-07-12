import java.util.*;

class ratio{
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the values of a and b 'a+b'");
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("Enter the values of c and d 'c-d'");
        c=s.nextInt();
        d=s.nextInt();
        float sum1,sum2,ratio;
        sum1=a+b;
        sum2=c-d;
        if(sum2!=0){
            ratio=sum1/sum2;
            System.out.println("The ratio is "+ratio);
        }
        else{
            System.out.println("The ratio is invalid");
        }
    }
}