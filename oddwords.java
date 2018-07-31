import java.util.*;
import java.io.*;
class oddwords{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
        int len=str.length();
        for(int i=0;i<len-1;i++){
            if(i%2!=0)
            {
                System.out.println("character at" + i + "is" + " " + str.charAt(i));
            }
        }
    }
}