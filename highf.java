import java.util.*;
import java.io.*;
class highf{
    public static void main(String a[])
    {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        String arr=str.toLowerCase();
        System.out.println(arr.length());
        int k=0;
        int s[];
        s=new int[20];
        for(int i='a';i<='z';i++)
        {
            int count=0;
            for(int j=0;j<arr.length();j++)
            {
                if(arr.charAt(j)==i)
                {
                    count++;
                    s[k]=count;
                    k++;
                }
            }
            if(count>0)
            {
                System.out.println((char)i + "=" + count);
            }
        
        }
        for(int i=0;i<arr.length();i++)
        {
            for(int j=i+1;j<arr.length();j++)
            {
                if(s[i]>s[j])
                {
                    int temp;
                    temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
        int len=arr.length()-1;
        System.out.println(arr.charAt(len-1));
        
    }
}