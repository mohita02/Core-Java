import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Buffer{
    public static void main(String a[])
    {
        InputStreamReader is=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(is);
        try{
        System.out.println("enter any character");
        char ch=(char)br.read();
        System.out.println("enter any string");
        br.readLine();
        String str=br.readLine();
        System.out.println("enter any integer");
        int i=Integer.parseInt(br.readLine());
        System.out.println("character " + ch);
        System.out.println("String " + str);
        System.out.println("Integer value " + i);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}