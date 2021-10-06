// Program to read from a file using FileInputStreamReader.

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

class FileInputStreamDemo {
    public static void main(String[] args) // throws Exception
    {

        try {
            FileInputStream fis = new FileInputStream("demo.txt");

            byte[] b = new byte[fis.available()];

            // int x;

            // while ((x = fis.read()) != -1)
            // System.out.print((char) x);

            String str = new String(b);

            System.out.println(str);
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException i) {
            System.out.println(i);
        }

    }
}