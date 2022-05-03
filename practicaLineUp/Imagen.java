package practicaLineUp;

import imonsh.Screen;

public class Imagen implements  Runnable {

    Banda b;
    Screen s;

    Imagen(Banda b, Screen s) {
        this.b = b;
        this.s = s;
    }
    @Override
    public void run() {
        s.setVisible(true);
        s.setBounds(
                700,100,600,600);
        s.cls();
        s.repaint();
         String url = "assets/Concierto/" + b.getName() + ".png";
         s.showImage(url);

        }

    }

