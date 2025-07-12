import java.util.*;
class area_of_triangle{
    public static void main(String args[]) {
        int b,h;
        double a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the breadth");
        b=s.nextInt();
        System.out.println("Enter the height");
        h=s.nextInt();
        a=(b*h)/2;
        System.out.println("The area of triangle is "+a);
    }
}