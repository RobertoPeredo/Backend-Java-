package practicaComic;

import imonsh.Screen;

public class Pagina implements Runnable {

    Screen s;

    Pagina(Screen s) {
        this.s = s;
    }

    public void run() {
        s.setBounds(100,100,600,600);
        for (int i = 1; i <= 18; i++) {

            s.cls();
            s.repaint();
            // Recorre las páginas del comic
            String url = "assets/img" + i + ".png";
            s.showImage(url);
                    try {
                // Pausa entre paginas
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}

