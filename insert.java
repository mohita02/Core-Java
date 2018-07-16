import java.util.Scanner;
class insert
{
    public static void main(String a[])
    {
        int arr[];
        arr=new int[10];
        Scanner sc=new Scanner(System.in);
        int pos;
        int n;
        int num;
        System.out.println("enter position");
        pos=sc.nextInt();
        System.out.println("enter the size of the array");
        n=sc.nextInt();
        System.out.println("enter elements in an array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter number to insert");
        num=sc.nextInt();
        arr[pos]=num;
        for(int i=0;i<n+1;i++)
        {
            System.out.println(arr[i]);
        }
    }
}