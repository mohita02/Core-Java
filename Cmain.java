import java.util.*;
import java.io.*;
class CDimension{
    int length;
    int breadth;
    int area;
    CDimension(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    void display()
    {
        System.out.println(length);
        System.out.println(breadth);
        area=length*breadth;
        System.out.println(area);
    }
}
class CArea extends CDimension{

    CArea(int length,int breadth)
    {
        super(length,breadth);
    }
    void display()
    {
        super.display();
    }
}
class CVolume extends CArea{
    int height;
    int length,breadth;
    CVolume(int length,int breadth,int height)
    {
        super(length,breadth);
        this.height=height;
        this.length=super.length;
        this.breadth=super.breadth;
    }
    //int a1;
    void display()
    {
        super.display();
        System.out.println(height);
        System.out.println(length*breadth*height);
    }
    
}
class Cmain{
    public static void main(String a[])
    {
        CVolume cv=new CVolume(2,4,6);
        cv.display();
    }
}