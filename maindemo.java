import java.util.*;
import java.io.*;
class one{
    int i=10;
    void display()
    {
        System.out.println("super class variable" + i);
    }
}
class two extends one{
    int i=20;
    void display()
    {
        System.out.println("subclass variable" + i);
        super.display();
        System.out.println("superclass variable" + super.i);
    }
}
class maindemo{
    public static void main(String a[])
    {
        two t=new two();
        t.display();
    }
}