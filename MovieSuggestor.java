import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.* ;
import java.net.HttpURLConnection ;
import java.awt.* ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.* ;



class MovieSuggestor
{

	public static void main(String[] args)
	{


		File f = new File("./") ;
		ArrayList<String> names = new ArrayList<String>(Arrays.asList(f.list()));
	
		for(String name : names)
		{System.out.print(name +"\n") ;
			name = name.substring(0, name.indexOf('.'));
		System.out.print(name +"\n") ;
		name = name.replaceAll(" ", "+") ;
		System.out.print(name +"\n") ;



		try {
 			 Desktop desktop = java.awt.Desktop.getDesktop();
				String movie = "http://www.omdbapi.com/?t=" + name + "&y=&plot=short&r=json" ;
  			 URI oURL = new URI(movie);
  			 desktop.browse(oURL);
		} catch (Exception e) {
  			e.printStackTrace();
					}

			}


	}


}

	
