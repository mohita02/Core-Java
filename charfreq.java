import java.util.Scanner;

class charfreq
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
        String ans = str.toLowerCase();
        for(int i='a';i<='z';i++)
        {
            int count=0;
            for(int j=0;j<ans.length();j++)
            {
                if(ans.charAt(j)==i)
                    count++;
            }
            if(count>0)
            {
                System.out.println((char)i + "=" + count);
            }
        }
        sc.close();
       
    }
}