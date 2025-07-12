import java.util.*;
class username{
    
    public void getdata(){
    String a;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter username\n");
    a = s.nextLine(); 
    System.out.println("Username is: " + a);
    }
}
class age{
    
    public void getdata(){
    int b;
    Scanner s = new Scanner(System.in);
    System.out.println("\nEnter age\n");
    b = s.nextInt(); 
    System.out.println("age is: " + b);
    }
}

class student{
    public static void main(String[] args) {
        username u=new username();
        age a=new age();
        u.getdata();
        a.getdata();
    }
}