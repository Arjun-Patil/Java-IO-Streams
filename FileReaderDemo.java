//Program to read from a file using FileReader.

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileReaderDemo {
    public static void main(String[] args) // throws Exception
    {

        try {
            FileReader fr = new FileReader("demo.txt");

            int x;

            while ((x = fr.read()) != -1)
                System.out.print((char) x);

            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException i) {
            System.out.println(i);
        }

    }
}