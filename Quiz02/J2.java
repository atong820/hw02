import java.io.*;
public class file_char_rand
{
   public static void main (String[] args) throws IOException
   {
      FileWriter fw = new FileWriter("rand_letters.txt");
      BufferedWriter bfw = new BufferedWriter(fw);
      int a;
     
      for(int i=1;i<=1000;i++)
      {
         a = (int)(Math.random()*(122-97+1)+97); // ASCII(Dec)97~122:a~z
         bfw.write((char)a);
         bfw.newLine();
      }
      bfw.flush();
      fw.close();
     
      FileReader fr = new FileReader("rand_letters.txt");
      BufferedReader bfr = new BufferedReader(fr);
      String str;int count=0;
      while((str=bfr.readLine())!=null)
      {
         count++;
         System.out.print(str+"  ");
         if((count%10==0)&&(count!=0))
            System.out.println();
      }
      System.out.println(count+" letters read");
      fr.close();
   }
}
