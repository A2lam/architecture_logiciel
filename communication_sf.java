import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Program
{
    public static void main(String[] args)
    {
        String content = "Hello world !";
        
        try 
        {
            FileWriter fileWriter = new FileWriter("file.log");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            bufferedWriter.write(content);

            bufferedWriter.close();
        }
        catch (IOException exception)
        {
            System.err.format("IOException: %s%n", exception);
        }
    }
}