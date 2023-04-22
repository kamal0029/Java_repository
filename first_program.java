import java.util.*;
public class first_program {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
        a[i]=sc.nextInt();
        }
        System.out.println("Array Elements are:");
        for(int i=0,j=n-1;i<n/2;i++,j--)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]);
        }
}
}
