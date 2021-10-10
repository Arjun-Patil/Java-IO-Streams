// Program to read from a file using FileInputStreamReader.

import java.io.*;

class BufferedReaderDemo {
    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("demo.txt");
        BufferedReader br = new BufferedReader(fr);

        int x;

        while ((x = br.read()) != -1)
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