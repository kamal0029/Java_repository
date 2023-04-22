import java.util.*;

public class kmaxmin
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("The Kth max elemnent is "+a[n-k]+" The kth minimum element is "+a[-1+k]);
    }
}