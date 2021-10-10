import java.io.ByteArrayInputStream;

class ByteArrayInputStreamDemo {

    public static void main(String[] args) throws Exception {
        byte[] b = { 'a', 'b', 'c', 'd', 'e', 'f' };
        ByteArrayInputStream bis = new ByteArrayInputStream(b);

        int x;

        while ((x = bis.read()) != -1) {
            System.out.println((char) x);
        }

        // String str = new String(bis.readAllBytes());
        // System.out.println(str);

        bis.close();
    }
}