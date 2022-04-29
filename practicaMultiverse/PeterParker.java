package practicaMultiverse;

import imonsh.Screen;

import java.awt.*;

public class PeterParker  extends  Spiderman implements PeterParkerActionCallBacks{
    PeterParker(String name, String alias, String gender, String identity, String occupation) {
        super(name, alias, gender, identity, occupation);
    }

    @Override
    public void SpiderSense(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), Color.blue);
        s.out("Tengo Sentido aracnido \n","Helvetica",28,Color.MAGENTA);
        s.showImage("assets/SpiderSense.png");
        s.setBounds(200,100,900,600);

    }

    @Override
    public void WallCrawling(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), Color.blue);
        s.out("Escalo paredes \n", "Helvetica",28,Color.MAGENTA);
        s.showImage("assets/WallCrawling.png");
        s.setBounds(200,100,900,600);

    }
}
