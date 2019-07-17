import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int d=sc.nextInt();
       int n=sc.nextInt();
       int sum=(n/2)*(2*a+(n-1)*d);
       System.out.print(sum);
       
    }
}
