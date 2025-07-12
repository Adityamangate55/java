import java.util.Scanner;
class hi{
    public static void main(String[] args) {
    double num1,num2;
    char operation;
    Scanner s=new Scanner(System.in);
    System.out.println("enter two value");
    num1=s.nextInt();
    num2=s.nextInt();  
    System.out.println("Enter the operation(+,-,*./)");
    operation=s.next().charAt(0);
    switch(operation)
    {
        case '+':
            System.out.println("Result: "+(num1+num2) );
            break;
        case '-':
            System.out.println("Result: "+(num1-num2));
            break;
        case '*':
            System.out.println("Result: "+(num1*num2));
            break;
        case '/':
            // Check division by zero scenario
            if(num2 != 0.0) 
                System.out.println("Result: "+(num1/num2));
            else 
                System.out.println("Cannot divide by zero" );
            break;
        default:
             System.out.println( "Invalid operation");
            break;
    }
    }
}