package practicaComic;

import imonsh.Screen;
import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.Voice;


public class Comic {

    public static void main(String[] args) {
        Screen img = new Screen();
        Screen text = new Screen();


        img.setVisible(true);
        text.setVisible(true);


        Thread pagina= new Thread( new Pagina(img));
        Thread texto = new Thread( new Texto(text));
        Thread voz = new Thread(new Voz());
        pagina.start();
        texto.start();
        voz.start();

    }
}
