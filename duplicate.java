import java.util.Scanner;
class duplicate
{   
    public static void main(String a[])
    {
    int arr[];
    arr=new int[10];
    Scanner sc=new Scanner(System.in);
   int n;
    System.out.println("enter the size of array");
    n=sc.nextInt();
    System.out.println("enter the elements in an array");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;)
        {
            if(a[i]==a[j])
            {
                for(int k=j;k<n-1;k++)
                a[k]=a[k+1];

              --n;                
                
            }
               else
                    j++;
                
    }
    }
    for(int i=0;i<n;i++)
    {
        System.out.println(arr[i]);
    }
}
}