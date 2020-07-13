import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.io.FileWriter;


public class Read_LinebyLine_Ques3
{

public static void main(String[] args)
{
        Map<String,Integer> map=new TreeMap<>();
        try
       {
       FileReader fis=new FileReader("file1.txt");
       BufferedReader br=new BufferedReader(fis);
       FileWriter fos=new FileWriter("file2.txt");
    
       String line;
       while((line=br.readLine())!=null)
       {
           String[] str=line.split(" ");
           for(String s:str)
             {
                if(map.containsKey(s))
                 {
                      map.put(s,map.get(s)+1);
                 }
                 else
                 {
                    map.put(s,1);
                 }
             }

	}
     
        Set s=map.entrySet();
        Iterator itr=s.iterator();

       while(itr.hasNext())
       {
         Map.Entry me=(Map.Entry)itr.next(); 
         String s1=me.getKey()+"\t:\t"+me.getValue()+"\n";

         fos.write(s1);
       }


      fis.close();
      fos.close();
      }
       catch(FileNotFoundException  e)
        {
          System.out.println(e);
        }
       catch(IOException e)
      {
          System.out.println(e);
       }
       
       

}

}