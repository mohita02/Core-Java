import java.util.*;
import java.io.*;
class one{
    void display()
    {
        System.out.println("one");
    }
}
class two extends one{
    void display()
    {
        System.out.println("two");
    }
}
class three extends one{
    void display()
    {
        System.out.println("three");
    }
}
class maindemo1
{
    public static void main(String a[])
    {
        one obj1=new one();
        one obj2=new two();
        one obj3=new three();
        obj1.display();
        obj2.display();
        obj3.display();
    }
}