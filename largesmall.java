import java.util.Scanner;
class largesmalljava
{
    public static void main(String a[])
    {
        int arr[];
        arr=new int[10];
        int large,small;
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        large=arr[0];
        small=arr[0];
        for(int i=0;i<10;i++)
       {
            if(arr[i]>large)
            {
                large=arr[i];
            }
            else if(arr[i]<small)
            {
                small=arr[i];
            }
        
        }
        System.out.println(large);
        System.out.println(small);
    }
}