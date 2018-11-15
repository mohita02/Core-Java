import java.util.*;
import java.io.*;
class second_small_large
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<Integer>();
        int n=sc.nextInt();
        int item;
        for(int i=0;i<n;i++)
        {
            item=sc.nextInt();
            al.add(item);
        }
       Collections.sort(al);
        int second_small=al.get(1);
        int second_large=al.get(al.size()-2);
        // System.out.println(second_large);
        // System.out.println(second_small);
        int avg=(second_large+second_small)/2;
        System.out.println("average : " + avg);
        if(al.contains(avg))
        {
            int count=Collections.frequency(al, avg);
            System.out.println("count of the avg in arraylist: "+ count);
        }
        else{
            System.out.println("0");
        }
    }
}