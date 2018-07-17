import java.util.Scanner;
class sumprime
{
    public static void main(String a[])
    {
        int arr[];
        arr=new int[6];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<6;i++)
        {
        int c=0;
        for(int j=2;j<arr[i];j++)
        {
            if(arr[i]%j==0)
            {
                c=1;
                break;
            }
        }
        if(c==0)
        {
            System.out.println(arr[i]);
            sum=sum+arr[i];
        }
        }
        System.out.println("sum of prime numbers is" + sum);
    }
}