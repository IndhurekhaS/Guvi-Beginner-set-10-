import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=0,s=1;
       while(n!=0)
       {
           m=n%10;
           s=s*m;
           n=n/10;
       }
       System.out.println(s);
       
    }
}
