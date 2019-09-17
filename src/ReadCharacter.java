import java.io.IOException;
import java.io.InputStream;

public class ReadCharacter {
    public static void main(String[] args) {
        try {
            System.out.println("Write one character");
            InputStream is = System.in;

            // Reads the next byte of data from the input stream
            char c = (char) is.read();

            System.out.println("your character is " + c);
        }
        catch (IOException ioe) {
            System.out.println("Exception while reading input " + ioe);
        }
    }
}
