import java.util.Scanner;
class palindrome{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int num,rem=0,rev=0;
        int sum=0;
        num=sc.nextInt();
        int temp=num;
        while(num>0)
        {
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        if(rev==temp)
        {
            System.out.println("It's a palindrome" + rev);
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}