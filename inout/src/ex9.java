import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ex9 {
    public static void main(String[] args) {
        try
        {
            File file = new File("/tmp/employee/roma1.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.println("Hello");
            printStream.println("3035");
            printStream.close();
            printStream.close();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}