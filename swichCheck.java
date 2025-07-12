import java.util.*;
class swichCheck {
    public static void main(String args[]){
        char a;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values of a");
        a=s.next().charAt(0);
        switch(a){
            case 'a':
            System.out.println("it is vowel");
            break;
            case 'e':
            System.out.println("it is vowel");
            break;
            case 'i':
            System.out.println("it is vowel");
            break;
            case 'o':
            System.out.println("it is vowel");
            break;
            case 'u':
            System.out.println("it is vowel");
            break;
            default:
            System.out.println("it's not vowel");
        }
    }
}