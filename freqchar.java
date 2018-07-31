import java.util.*;
import java.io.*;
class freqchar{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        int count=0;
        str=sc.nextLine();
        int len=str.length();
        for(int i=0;i<len-1;i++)
        {
            if(str.charAt(i)=='a')
                {
                    count++;
                }
        }
        System.out.println(count);
    }
}