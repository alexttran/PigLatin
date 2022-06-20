import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PigLatin {
    public static void pigLatin(String inFile, String outFile) throws FileNotFoundException {
        Scanner console = new Scanner(new File(inFile));
        PrintWriter fWriter = new PrintWriter(new File(outFile));
        while (console.hasNextLine()) {
            String str = console.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i, i + 1).equals("a")) {

                }
            }
        }
    }


}
