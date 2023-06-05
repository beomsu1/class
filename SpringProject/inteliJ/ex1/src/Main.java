import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Main {

    // bad code
    public static void main(String[] args) throws Exception {

        URL url = new URL("https://cdn.011st.com/11dims/resize/1000x1000/quality/75/11src/product/4239818461/B.jpg?63000000");

        InputStream fin = url.openStream();

        // 1단계 : 빨떄 준비
        // FileInputStream fin = new FileInputStream("c:\\zzz\\test.jpg");

        FileOutputStream fos = new FileOutputStream("c:\\zzz\\copy.jpg");

        System.out.println(fin);

        // 2단계 : 읽고 쓰기
        while (true) { // 무한 루프
            int data = fin.read();
            if (data == -1) {
                break;
            }
            fos.write(data);
        } // end while

    }
}