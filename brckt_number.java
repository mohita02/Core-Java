import java.util.*;
import java.io.*;
class brckt_number
{
    public static void main(String args[])
    {
        String exp;
        Scanner sc=new Scanner(System.in);
        exp=sc.next();
        int n=exp.length();
        
            Stack<Integer> stk=new Stack<Integer>();
            int num=1;
            for(int i=0;i<n;i++)
            {
                if(exp.charAt(i)=='(')
                {
                    stk.push(num);
                    System.out.print(num+" ");
                    num++;
                }
                else if(exp.charAt(i)==')')
                {
                    System.out.print(stk.peek()+" ");
                    stk.pop();
                }
            }
        
    }
}