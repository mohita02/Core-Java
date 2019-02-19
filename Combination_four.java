import java.util.*;

class Combination_four
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum;
        System.out.println("enter the sum");
        sum=sc.nextInt();
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int []a=new int[size];
        for(int m=0;m<size;m++)
        {
            a[m]=sc.nextInt();
        }
        System.out.println("((((((((((((((((((((((");
        for(int i=0;i<size-3;i++)
        {
            for(int j=i+1;j<size-2;j++)
            {
                for(int k=j+1;k<size-1;k++)
                {
                    for(int l=k+1;l<size;l++)
                    {
                        if(a[i]+a[j]+a[k]+a[l]==sum)
                        {
                            System.out.println(a[i] + " " + a[j] + " " + a[k] + " " + a[l]);
                        }
                    }
                }
            }
        }
    }
}