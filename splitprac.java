import java.util.*;
import java.io.*;
class splitprac
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        String s1="lets learn split function in java";
        String[] words=s1.split("\\s");
        int count=0;
        for(String w:words)
        {
            System.out.println(w);
            count++;
        }
        System.out.println(count);
    }
}