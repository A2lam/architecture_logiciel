import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FSServer
{
    public void receive()
    {
        try
        {
            FileReader fileReader = new FileReader("file.log");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            if (line.equals("Hello world !"))
            {
                System.out.println("Reçu");
            }
        }
        catch (IOException exception)
        {
            System.err.format("IOException: %s%n", exception);
        }
    }
}
