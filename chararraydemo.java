import java.io.*;
class chararraydemo{
  public static void main(String a[])throws IOException
  {
      int i;
     // CharArrayReader c=null;
       CharArrayWriter cw=null;
      
      String str="hello everyone";
      int l=str.length();
      char buffer[]=new char[l];
      //str.getChars(0, l,buffer,0);
      char[] chardata=str.toCharArray();
      FileWriter fw = new FileWriter("./text.txt");
      try{
         cw = new CharArrayWriter();
         cw.write(chardata);
         cw.writeTo(fw);
        /*  c=new CharArrayReader(buffer);
          while((i=c.read())!=-1)
          {
              //char ch=(char).read();
              System.out.print((char)i + " ");
          }*/
      }
      catch(Exception ex)
      {
          System.out.println(ex);
      }
      finally{
         fw.close();
          
              cw.close();
          
      }

  }  
}