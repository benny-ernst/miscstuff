
import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        int spaceIndex;
        int spaceCount;
        String input;
        int temp;
        int i;

        spaceCount = 0;
        spaceIndex = 0;
        temp = 0;
        input = scnr.nextLine();
        scnr.close();

        for (i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        String[] arrayTest = new String[spaceCount + 1];

        
        for (i = 0; i <= spaceCount; i++) {
            temp = spaceIndex;
            spaceIndex = input.indexOf(' ', spaceIndex + 1);
            if (spaceIndex == -1) {
                spaceIndex = input.length();
            }
            arrayTest[i] = input.substring(temp, spaceIndex);
            //System.out.println(temp + " " + spaceIndex);
        }

        for (i = 0; i < arrayTest.length; i++) {
            if (i == arrayTest.length - 1) {
                System.out.println(arrayTest[i]);
            } else {
                System.out.print(arrayTest[i] + ", ");
            }
        }
    }
}
