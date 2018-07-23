import java.util.*;
import java.io.*;
class strsub
{
    public static void main(String a[]) throws IOException
    {

        Scanner sc=new Scanner(System.in);
        String str;
      
        String s;
        s=sc.nextLine();
        System.out.println("enter the main string");
        str=sc.nextLine();
        int b=str.indexOf(s);
       if(b==-1)
       System.out.println("string not found");
       else
       System.out.println("string found at index" + b);
    }


}