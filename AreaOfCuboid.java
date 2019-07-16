import java.util.*;
public class MyClass{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        int lb=(l*b);
        int bh=(b*h);
        int lh=(l*h);
        int ts=(lb+bh+lh);
        int sum=2*ts;
        System.out.println(sum+" "+l*b*h);
    }
}
