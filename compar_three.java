import java.util.*;
class compar_three {
    public static void main(String args[]){
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the values of a");
        a=s.nextInt();
        System.out.println("Enter the values of b");
        b=s.nextInt();
        System.out.println("Enter the values of c");
        c=s.nextInt();
        if(a<b||a<c){
            if(b<a||b<c){
                if(c<a||c<b){

                }
                else{
                    System.out.println("c is grater that both b and a");
                }
            }
            else{
                System.out.println("b i3s grater that both a and c");
            }
        }
        else{
            System.out.println("a is grater that both b and c");
        }
    }
}
