//Program to write into a file using FileOutputStreamReader..

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class FileOutputStreamDemo {
    public static void main(String[] args) // throws Exception
    {

        try {
            FileOutputStream fos = new FileOutputStream("demo.txt");
            String str = "Java Programming\n";

            // byte[] b = str.getBytes();
            // for (byte x : b)
            // fos.write(x);

            fos.write(str.getBytes());
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException i) {
            System.out.println(i);
        }

    }
}