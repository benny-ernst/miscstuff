import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

public class InputStream 
{
    public static void main(String[] args) throws IOException
    {
        Scanner scnr = new Scanner(System.in);
        StringWriter sWriter = new StringWriter();
        PrintWriter pWriter = new PrintWriter(sWriter);
//        int userInput;
//        char userChar;
        String userString;
        String testString;
        Scanner stringSS;
        String stringWord1;
        String stringWord2;
        String stringWord3;
        String stringWord4;

//        userInput = System.in.read();
//        userChar = (char)userInput;
//        System.out.println(userInput);
//        System.out.println(userChar);

        userString = scnr.next();
        scnr.close();
        testString = "hello my name is";
        stringSS = new Scanner(testString);
        stringWord1 = stringSS.next();
        stringWord2 = stringSS.next();
        stringWord3 = stringSS.next();
        stringWord4 = stringSS.next();
        stringSS.close();


        pWriter.print(userString);
        System.out.println(sWriter.toString());
        System.out.println(stringWord1);
        System.out.println(stringWord2);
        System.out.println(stringWord3);
        System.out.println(stringWord4);
        
    }
}