import java.util.Scanner;
class cards{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int sume=0,sumo=0;
        int num,rem=0;
        System.out.println("enter the card picked by johnny");
        num=sc.nextInt();
        while(num!=0)
        {
            rem=num%10;
            if(rem%2==0)
            {
                sume=sume+rem;
            }
            else
            {
                sumo=sumo+rem;
            }
            num=num/10;
        }
        if(sume==sumo)
        {
            System.out.println("johnny will win the card game");
        }
        else{
            System.out.println("johnny will not win the card game");
        }

    }
}