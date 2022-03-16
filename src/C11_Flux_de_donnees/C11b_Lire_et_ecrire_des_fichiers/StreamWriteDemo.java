package C11_Flux_de_donnees.C11b_Lire_et_ecrire_des_fichiers;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class StreamWriteDemo {
    public static void main(String[] args) {
        try {
            // The first argument is the path where the written file will be
            // This is a absolute path for Windows. In Linux, something
            // like "~/out.txt" would write the file directly in you home directory 
            FileOutputStream fs = new FileOutputStream("c://tmp//out.txt", true);
            PrintWriter pw = new PrintWriter(fs);
            
            // This is the content which will be written INTO the file
            pw.print("This is the text which will be written");
            
            // We have to close the file when we are done working with it
            pw.close();
        } catch (Exception e) {
            System.out.println("File can't be written");
            e.printStackTrace();
        }
        System.out.println("Writing done");
    }
}
