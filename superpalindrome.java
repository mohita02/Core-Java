import java.util.*;
class superpalindrome{
    public static void main(String a[])
    {
        int num;
        int square=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter sny number");
        num=sc.nextInt();
        int rev=0,rem=0;
        int srev=0,srem=0;
        int temp=num;
        while(num!=0)
        {
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        System.out.println(rev);
        square=(temp*temp);
        System.out.println(square);
        int temp_square=square;
        while(square!=0)
        {
            srem=square%10;
            srev=(srev*10)+srem;
            square=square/10;
        }
        System.out.println(srev);
        if(temp==rev && temp_square==srev)
        {
            System.out.println("It's a Super-palindrome");
        }
        else{
            System.out.println("not a super-palindrome");
        }
    }
}
