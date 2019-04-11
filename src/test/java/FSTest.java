import org.junit.jupiter.api.Test;

public class FSTest
{
    @Test
    void monoClient()
    {
        FSClient client = new FSClient();
        client.send("Hello World !");
    }
}
