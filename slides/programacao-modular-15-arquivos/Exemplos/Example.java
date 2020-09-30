/**
 * Created by felipecunha1 on 30/04/17.
 */
import java.io.*;

public class Example {

    public void read() throws IOException {
        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
        String ler = null;
        ler = d.readLine();
        while(!ler.isEmpty()) {
            int i = Integer.parseInt(ler.trim());
            System.out.println("" + i);
            ler = d.readLine();
        }
        d.close();
    }

    public static void main(String []args) throws IOException {
        Example ex = new Example();
        ex.read();
    }


}
