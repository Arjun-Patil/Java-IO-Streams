import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

class ByteArrayOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');

        byte[] b = bos.toByteArray();
        for (byte x : b)
            System.out.println((char) x);

        bos.writeTo(new FileOutputStream("Demo1.txt"));
    }
}