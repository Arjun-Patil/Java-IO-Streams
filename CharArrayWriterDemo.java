import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.FileOutputStream;

class CharArrayWriterDemo {
    public static void main(String[] args) throws Exception {
        CharArrayWriter cw = new CharArrayWriter(20);
        cw.write('a');
        cw.write('b');

        char[] b = cw.toCharArray();
        for (char x : b)
            System.out.println(x);

        cw.close();
    }
}