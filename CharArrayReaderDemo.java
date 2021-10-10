import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;

class CharArrayReaderDemo {

    public static void main(String[] args) throws Exception {
        char[] c = { 'a', 'b', 'c', 'd', 'e', 'f' };
        CharArrayReader cr = new CharArrayReader(c);

        int x;

        while ((x = cr.read()) != -1) {
            System.out.println((char) x);
        }

        cr.close();
    }
}