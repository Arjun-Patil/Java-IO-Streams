//Program to Copy content of two files into destination file.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

class CopyMultipleFiles {
    public static void main(String[] args) throws Exception {

        FileInputStream fis1 = new FileInputStream("File1.txt");
        FileInputStream fis2 = new FileInputStream("File2.txt");

        FileOutputStream fos = new FileOutputStream("Destination.text");

        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

        int b;

        while ((b = sis.read()) != -1)
            fos.write(b);

        fis1.close();
        fis2.close();
        fos.close();

        sis.close();

    }
}