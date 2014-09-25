import java.awt.Desktop;
import java.io.File;
import java.io.IOException;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tagUrl= "https://api.stackexchange.com/2.2/tags?site=stackoverflow";
		String infoUrl="https://api.stackexchange.com/2.2/info?site=stackoverflow";
		
		String url="C://Users/Arun/Desktop/d3/PLBar.html";
		
		try {
			StackOverflowData.readUrl(tagUrl,"/Output.json");
			StackOverflowData.readUrl(infoUrl,"/Info.json");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File htmlFile = new File(url);
		try {
			Desktop.getDesktop().browse(htmlFile.toURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
