import java.util.*;
class count_dup
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String []array_1=new String[100];
        String []array_2=new String[100];
        // int[]a=new int[20];
        // int count=0;
        // for(int i=0;i<8;i++)
        // {
        //     a[i]=sc.nextInt();
        // }
        // for(int i=0;i<8;i++)
        // {
        //     for(int j=i+1;j<8;j++)
        //     {
        //         if(a[i]==a[j])
        //         {
        //             a[j]=0;
        //         }
        //     }
        // }
        // for(int m=0;m<8;m++)
        // {
        //     if(a[m]==0)
        //     {
        //         count++;
        //     }
        // }
        // System.out.println("**************"+count);
        for(int i=0;i<5;i++)
        {
            array_1[i]=sc.next();
        }
        for(int j=0;j<5;j++)
        {
            array_2[j]=sc.next();
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(array_1[i].equals(array_2[j]))
                {
                    System.out.println("*****************"+array_2[j]);
                }
            }
        }
    }
}