import java.util.Scanner;
class digit{
    public static void main(String a[])
    {
        int r,sum=0,temp,temp_sum=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int num=sc.nextInt();
        while(num!=0)
        {
            r=num%10;
            temp=r+1;
            if(temp==10)
                temp=0;
                num=num/10;
                sum=(sum*10)+temp;

        }
        while(sum!=0)
        {
            i=sum%10;
            sum=sum/10;
            temp_sum=(temp_sum*10)+i;
        }
        System.out.println(temp_sum);
    }
}