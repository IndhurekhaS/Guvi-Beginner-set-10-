import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       int a[]=new int [n];
       for(int i=1;i<n;i++)
       {
           a[i]=sc.nextInt();
       }
       for(int i=k;i<a.length;i++)
       {
           System.out.println(a[i]);
           break;
       }
       
    }
}
