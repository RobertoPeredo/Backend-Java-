package practicaMultiverse;

import imonsh.Screen;

import java.awt.*;

public class MilesMorales extends Spiderman implements MilesMoralesActionCallBacks{
    MilesMorales(String name, String alias, String gender, String identity, String occupation) {
        super(name, alias, gender, identity, occupation);
    }

    @Override
    public void Camouflage(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), Color.blue);
        s.out("Me camuflajeo \n", "Helvetica",28,Color.MAGENTA);
        s.showImage("assets/Spider-Camouflage.png");
        s.setBounds(200,100,900,600);

    }

    @Override
    public void VenomStrike(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), Color.blue);
        s.out("Saco rayos \n", "Helvetica",28,Color.MAGENTA);
        s.showImage("assets/VenomStrike.png");
        s.setBounds(200,100,900,600);

    }
}
