package char_streams;

import java.io.*;

public class Main{
    static int charToWrite;
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        System.out.println(args[0]);

        /*Read a File */
        FileReader fr = new FileReader("char_streams/read_file.txt");

        /*Write a File */
        FileWriter fw = new FileWriter("char_streams/file_written.txt");

        while((charToWrite = fr.read()) != -1){
            fw.write(charToWrite);
        }

        fr.close();
        fw.close();
    }
}