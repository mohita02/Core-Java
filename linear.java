import java.util.Scanner;
class linear
{
    public static void main(String a[])
    {
        int num;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        n=sc.nextInt();
        int arr[];
        arr=new int[n];
        System.out.println("enter elements in an array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the number to search");
        num=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==num)
            System.out.println("number found at" + (i));

            else if(num==n)
            {
                System.out.println("number not in the array");
            }
        }

    }
}