package FilesHAn;
import java.io.*;

class FileHandling {
    public static void main(String args[]) throws Exception {
        File f = new File("New_File2.txt");
        f.createNewFile();
        FileWriter w=new FileWriter("New_File.txt");
        w.write("Hello World!");
        w.close();
      }
}