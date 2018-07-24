import java.util.*;
import java.io.*;
class reverseword
{
    public static void main(String a[])
    {
        String str;
        Scanner sc=new Scanner(System.in);
        String[] words;
        str=sc.nextLine();
        words=str.split(" ");
        String revstring="";
        for(int i=0;i<words.length;i++)
        {
            String word=words[i];
            String revwords="";
            for(int j=word.length()-1;j>=0;j--)
            {
                revwords=revwords+word.charAt(j);
            }
            revstring=revstring+revwords+" ";
         
        }
        System.out.println(str);
        System.out.println(revstring);
       
    }
}