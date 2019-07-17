import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int sum=0,sum1=0;
       while(n!=0)
       {
           sum=n%10;
           sum1=sum1*10+sum;
           n=n/10;
       }
       System.out.println(sum1);
    }
}
