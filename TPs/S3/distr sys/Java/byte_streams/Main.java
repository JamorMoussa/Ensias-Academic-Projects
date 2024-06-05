package byte_streams;

import java.io.*;

public class Main {

    static int dataByte;
    public static void main(String[] args) throws FileNotFoundException {

        try {
            FileInputStream fs = new FileInputStream("byte_streams/input.txt");
            FileOutputStream fo = new FileOutputStream("byte_streams/output.txt");
    
            BufferedInputStream bfs = new BufferedInputStream(fs);
            BufferedOutputStream bfo = new BufferedOutputStream(fo);
    
            while( (dataByte = bfs.read()) != -1){
                bfo.write(dataByte);
            }
            
            /*You must close buffer before clode the File Stream */

            bfs.close();
            bfo.close();
            fo.close();
            fs.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
