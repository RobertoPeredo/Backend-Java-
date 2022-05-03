package practicaLineUp;

import imonsh.Screen;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Musica implements Runnable{

    Banda b;


    Musica(Banda b) {
        this.b = b;
         }

    @Override
    public void run() {
        try {
            String s = "assets/Concierto/" + b.getName() + ".mp3";
            Player rep = new Player(new FileInputStream(s));
            rep.play();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
