import java.util.Scanner;
class countdigit{
    public static void main(String a[])
    {
       
        long num;
        int rem=0;
        int arr[];
        arr=new int[100];
        Scanner sc=new Scanner(System.in);
       
        System.out.println("enter any number");
        num=sc.nextLong();
        while(num>0)
        {
            rem=(int)num%10;
            arr[rem]++;
            num=num/10;
        }
        for(int i=0;i<10;i++)
        {  
            if(arr[i]>=0)
            System.out.println( i  + "="  + arr[i]);
        }
    
   
    }
}