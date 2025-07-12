import java.util.*;
class primenum{
    public static void main(String[] args) {
        int n;
        char a;
        int c=0;
        Scanner s=new Scanner(System.in);
        System.out.println("do you want to chack");
        a=s.next().charAt(0);
        while (a=='y') { 
        System.out.println("Enter the value");
        n=s.nextInt();
        
            if(n>1){
                for(int i=1;i<=n;i++){
                    if(n%i==0)
                    c++;
                }
                if(c>2){
                    System.out.println("is not prime");
                }
                else{
                    System.out.println("is prime");
                }
            }
            else{
                System.out.println("is not prime");
            }
            break;
        }
        System.out.println("the end");
    }     
}
