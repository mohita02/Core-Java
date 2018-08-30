import java.util.*;
import java.io.*;
interface stackin
{
    void push(int item);
    void pop();
    void display();
}
class stackclass implements stackin{
    int[] arr;
    int size;
    int top;
   // arr=new int[20];
   Scanner sc=new Scanner(System.in);
    stackclass(int z)
    {
        top=1;
        size = z;
        arr=new int[z];
    }
    public void push(int item)
    {
            arr[top]=item;
            top++;
    }
    public void pop()
    {
        // for(int i=0;i<size;i++)
        // {
        //     System.out.println(arr[i]);
        // }
        top--;
    }
    public void display(){
        for(int i=0;i<top;i++)
        {
           // n=sc.nextInt();
            //push(n);
            if(arr[i]>0)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
class mainstack{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        stackin s;
        s=new stackclass(size);
        // s.push(10);
        // s.push(20);
        // s.push(30);
        int j=1;
        do{
            s.push(j);
            j++;
        }while(j<=size-1);
        s.display();
        s.pop();
        s.display();
        
    }
}