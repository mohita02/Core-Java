import java.util.*;
import java.io.*;
class strwords{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        int count=1;
        str=sc.nextLine();
       // int len=str.length();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
            {
                count++;
            }
        }
        System.out.println("no. of words are" + count);
    }
}