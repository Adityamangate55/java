import java.util.*;
class volume_of_sphere {
    public static void main(String args[]){
        int r;
        double volume;
        final double pi=3.14;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the values");
        r=s.nextInt();
        volume=(pi*r*r*r*4)/3;
        System.out.println("The square of values is "+volume);
    }
}

