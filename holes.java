import java.util.*;
import java.io.*;
class holes{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int num;
        int rem=0;
        int h=0;
        int sum=0;
        num=sc.nextInt();
        while(num>0)
        {
            rem=num%10;
            if(rem==1 || rem==2 || rem==5 || rem==7 ||rem==3)
            {
                h=0;
            }
            else if(rem==0 || rem==4 || rem==6 || rem==9)
            {
                h=1;
            }
            else{
                h=2;
            }

            sum=sum+h;
            num=num/10;
        }
        System.out.println("the total number of holes are " + sum);
    }
}