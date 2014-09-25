import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.zip.GZIPInputStream;


public class StackOverflowData {
	

	//https://api.stackexchange.com/2.2/tags?site=stackoverflow	


	//gets the json from api data and writes it into a file 
	public static void readUrl(String urlString, String path) throws Exception {
		BufferedReader reader = null;		
		BufferedWriter writer=null;
		try {
			URL url = new URL(urlString);
			reader = new BufferedReader(new InputStreamReader(new GZIPInputStream(url.openStream())));	
			writer=new BufferedWriter(new FileWriter(path));
			
			String l;
			
			while((l=reader.readLine())!=null){
				writer.write(l);
			}			

		} finally {
			if (reader != null)
				reader.close();
			if(writer!=null){
				writer.close();
			}
		}
	}

}


