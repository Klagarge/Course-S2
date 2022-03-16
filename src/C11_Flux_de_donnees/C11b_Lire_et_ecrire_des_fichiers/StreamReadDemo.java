package C11_Flux_de_donnees.C11b_Lire_et_ecrire_des_fichiers;

import java.io.BufferedReader;
import java.io.FileReader;

public class StreamReadDemo {
    public static void main(String args[]) {
        try {
            // The first argument is the path where the file will be read.
            // This is a absolute path for Windows. In Linux, something
            // like "~/out.txt" would read the file directly in you home directory
            FileReader f = new FileReader("c://tmp//stuff.txt");
            BufferedReader bf = new BufferedReader(f);
            
            String line = "";
            
            // Each readLine() call CONSUMES the complete line
            line = bf.readLine();
            System.out.println("The first line of file is :" + line);
            line = bf.readLine();
            System.out.println("The second line of file is :" + line);
            bf.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
