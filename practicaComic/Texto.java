package practicaComic;

import imonsh.Colors;
import imonsh.Screen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Texto implements Runnable{

    Screen s;

    Texto (Screen s) {
        this.s = s;

    }
    // Lee un archivo de texto y muestra el contenido en un screen
    public void run() {
        s.setBounds(750,100,500,300);
        try {
            FileInputStream fis = new FileInputStream("assets/texto/texto.txt");
            int i;
            while ((i = fis.read()) != -1) {
                // 124 es el caracter '|' que indica una nueva pagina
                if (i == 124) {
                    Thread.sleep(6000);
                    s.cls();
                } else {
                    // Imprime los dialogos de la pagina correspondiente
                    char a = (char)i;
                    s.out(String.valueOf(a), "MV Boli", 24, Colors.BlueHorizon);
                }
            }
            fis.close();
        } catch (IOException | InterruptedException ioe) {
            ioe.printStackTrace();
        }
    }
}
