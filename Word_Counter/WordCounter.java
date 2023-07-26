import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class WordCounter {

    public static void main(String[] args) throws IOException {

        FileInputStream fin=new FileInputStream("words.txt");
        Scanner fileInput=new Scanner(fin);

	BufferedReader br = new BufferedReader(new FileReader("words.txt"));
 	String line;
 	while ((line = br.readLine()) != null) 
	{
		System.out.println("The String in a File is = "+line);								  							  		System.out.println("\n\n");
 	}
        int total=0;
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        while (fileInput.hasNext())
        {
            String nextWord=fileInput.next();
            //check if the word is present in the map or not
            if(map.containsKey(nextWord))
            {
                map.put(nextWord,map.get(nextWord)+1);
                total++;
            }
            else
            {
                map.put(nextWord,1);
                total++;
            }
        }
        fin.close();
        fileInput.close();
        for (Map.Entry<String,Integer> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
        System.out.println("Total no. of words="+total);
    }
}