// Program to read from a file using FileInputStreamReader.

import java.io.*;

class BufferedInputStreamDemo {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("demo.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        int x;

        while ((x = bis.read()) != -1)
            System.out.print((char) x);

        // System.out.print((char) bis.read());
        // System.out.print((char) bis.read());
        // System.out.print((char) bis.read());
        // bis.mark(10);
        // System.out.print((char) bis.read());
        // System.out.print((char) bis.read());
        // bis.reset();
        // System.out.print((char) bis.read());
        // System.out.print((char) bis.read());

    }
}