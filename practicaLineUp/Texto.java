package practicaLineUp;

import imonsh.Screen;

public class Texto implements Runnable{
    Banda b;
    Screen s;

    Texto(Banda b, Screen s) {
        this.b = b;
        this.s = s;
    }

    @Override
    public void run() {
        s.setVisible(true);
        s.setBounds(100,100,600,600);
        s.cls();
        s.repaint();
       s.out(b.showMessage());

    }
}
