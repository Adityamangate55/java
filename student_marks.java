import java.util.*;
class student_marks{
    public static void main(String args[]) 
    {
        int m1,m2,m3,total;
        double avg;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the marks");
        System.out.println("DS");
        m1=s.nextInt();
        System.out.println("Linux");
        m2=s.nextInt();
        System.out.println("Cpp");
        m3=s.nextInt();
        total=m1+m2+m3;
        avg=total/3.0;
        System.out.println("Total marks = "+total);
        System.out.println("Average = "+avg);
    }
}