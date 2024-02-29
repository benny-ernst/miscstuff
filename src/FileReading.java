import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public class FileReading {
    public static void main(String[] args) throws IOException
    {
        FileInputStream fileByteStream = null;
        Scanner inFS = null;
        String fileLine;
        StringWriter sWriter = new StringWriter();
        PrintWriter pWriter = new PrintWriter(sWriter);

        fileByteStream = new FileInputStream("src\\file.txt");
        inFS = new Scanner(fileByteStream);


        System.out.println();
        while (inFS.hasNextLine())
        {
            fileLine = inFS.nextLine();
            pWriter.println(fileLine);
        }

        System.out.println(sWriter.toString());
        fileByteStream.close();
        inFS.close();
    }
}
