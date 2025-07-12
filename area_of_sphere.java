import java.util.*;
class area_of_sphere {
    public static void main(String args[]){
        int r;
        double area;
        final double pi=3.14;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the values");
        r=s.nextInt();
        area=pi*r*r*4;
        System.out.println("The square of values is "+area);
    }
}

