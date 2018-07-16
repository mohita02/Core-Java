import java.util.Scanner;
class secondlarge
{
    public static void main(String a[])
    {
        int arr[];
        arr=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        System.out.println("enter the elements in an array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp;
                if(arr[i]<arr[j])
                {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
            }
        }
        System.out.println("second largest element" + arr[1]);
        System.out.println("second smallest element" + arr[n-2]);
    }
}