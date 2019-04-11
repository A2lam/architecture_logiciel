public class FSClient
{
    public void send(String message)
    {
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
