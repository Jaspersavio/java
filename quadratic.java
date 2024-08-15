import java.util.*;
public class Quadratic{
    public static void main(String []Args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the first Number ");
        int a=sc.nextInt();
        
        System.out.print("Enter the Second Number ");
        int b=sc.nextInt();
        
        System.out.print("Enter the Third Number ");
        int c=sc.nextInt();
        
        double d=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        
        
        double f=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
        
        
        System.out.print("The Zeroes are "+d);
        System.out.print("The Zeroes are "+f);
        
    }
}
