import java.io.*;
import java.net.URL;
import java.net.MalformedURLException;


public class webtesting {
    public static void DownloadWebPage(String webpage) {
        try {
            URL url = new URL(webpage);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            BufferedWriter writer = new BufferedWriter(new FileWriter("Download.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
            }
            reader.close();
            writer.close();
            System.out.println("Definitions fetched ");

        } catch (MalformedURLException mue) {
            System.out.println("Malformed URL Exception raised");
        } catch (IOException ie) {
            System.out.println("IOException raised");
        }
    }
}
