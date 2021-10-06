//Program to copy content of one file to another file.

import java.io.FileInputStream;
import java.io.FileOutputStream;

class CopyFile {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("source1.txt");
        FileOutputStream fos = new FileOutputStream("source2.txt");

        int x;
        while ((x = fis.read()) != -1) {
            if (x >= 65 && x <= 90)
                fos.write(x + 32);
            else
                fos.write(x);
        }

        // Method 2
        // byte[] b = new byte[fis.available()];
        // fis.read(b);

        // String str = new String(b);
        // str = str.toLowerCase();
        // fos.write(str.getBytes());

        fis.close();
        fos.close();
    }
}