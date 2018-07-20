import java.util.Scanner;
class lift{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int n,n1,n2,n3,d1=0,d2=0,d3=0,d11=0,d22=0,d33=0;
        System.out.println("enter the floor you want to go on");
        n=sc.nextInt();
        System.out.println("enter the first floor");
        n1=sc.nextInt();
        System.out.println("enter the second floor");
        n2=sc.nextInt();
	System.out.println("enter the third floor");
	n3=sc.nextInt();
       	d1=n-n1;
	d2=n-n2;
	d3=n-n3;
	if(java.lang.Math.abs(d1)<java.lang.Math.abs(d2) && java.lang.Math.abs(d1)<java.lang.Math.abs(d3))
	{
	//if(java.lang.Math.abs(d1)==java.lang.Math.abs(d2) || java.lang.Math.abs(d1)==java.lang.Math.abs(d3))
	System.out.println(n1);
	}
	else if(java.lang.Math.abs(d2)<java.lang.Math.abs(d1) && java.lang.Math.abs(d2)<java.lang.Math.abs(d3))
	{
	//if(java.lang.Math.abs(d2)==java.lang.Math.abs(d3))
	System.out.println(n2);
	}
	else
	System.out.println(n3);
       
       /* {
            if((n3-n)<(n2-n) || (n-n3)<(n-n2) && (n3-n)<(n1-n) || (n-n3)<(n-n1))
            System.out.println(n3);
            else if((n2-n)<(n1-n) || (n-n2)<(n-n1) && (n2-n)<(n3-n) || (n-n2)<(n-n3))
            System.out.println(n2);
            else
            System.out.println(n1);
        }
        else
        System.out.println("wrong input");
        

    }*/
}
}
