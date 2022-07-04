import java.io.File;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class FilePacker{
public static void main(String[] args)
{
// System.out.println("FilePacker");
try{
    Scanner sobj=new Scanner(System.in);
    System.out.println("Please enter  file name:");
    String fileName=sobj.nextLine();
    
    File fobj=new File(fileName);

    if(fobj.exists()){
     FileInputStream fiobj=new FileInputStream(fobj);
      byte buffer[] =new byte[100];
      int ret=0;

      while((ret=fiobj.read(buffer))>0)
      {
          String str1=new String(buffer,StandardCharsets.UTF_8);
          System.out.println(str1);

      }
     }
     else{
         System.out.println("There is no such file");
     }
}
catch(IOException obj)
{
    System.out.println(obj);
}
}


}
