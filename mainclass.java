import java.util.*;
import java.io.*;
class base
{

    base()
    {
        System.out.println("base class constructor");
    }
}
class derived extends base{
    
    derived()
    {
        System.out.println("derived class constructor");
    }
}
public class mainclass
{
    public static void main(String a[])
    {
        derived d=new derived();
    }
}