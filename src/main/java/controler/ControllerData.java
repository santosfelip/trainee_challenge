package controler;

import java.io.*;

public class ControllerData {

   public ControllerData() {

   }

    public String AccessData()
    {
        String line = null;
        FileReader arq = null;

        try {
            String wayAbsolute = new File("").getAbsolutePath();
            wayAbsolute += "/src/main/java/persistence/data";
            System.out.println(wayAbsolute);
            arq = new FileReader(wayAbsolute);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            return null;
        }
        BufferedReader readerFile = new BufferedReader(arq);

        try {
            line = readerFile.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        while (line != null){

            try {
                line += readerFile.readLine();
                System.out.println(line);
            } catch (IOException ex) {
                ex.printStackTrace();
                return null;
            }
        }

        try {
            arq.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }

        return line;
    }
}
