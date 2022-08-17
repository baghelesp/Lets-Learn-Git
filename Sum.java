import java.util.*;
public class Sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first Integer: ");
        int a=sc.nextInt();
        System.out.print("Enter Second Integer: ");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Sum of "+a+" and "+b+" is --> "+c);
    }
}