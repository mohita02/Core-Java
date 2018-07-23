import java.util.*;
import java.io.*;
class freqwords{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("enter the string");
        str=sc.nextLine();
        System.out.println("enter the substring");
        String sub;
        sub=sc.nextLine();
        int ind,count=0;
        for(int i=0;i+sub.length()<=str.length();i++)
        {
            ind=str.indexOf(sub,i);
            if(ind>=0)
            {
                count++;
                i=ind;
                ind=-1;
            }
        }
        System.out.println("occurence of the word is" + count);

    }
}