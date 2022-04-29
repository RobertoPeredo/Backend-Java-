package practicaMultiverse;

import imonsh.Screen;

import java.awt.*;

public class GwenStacy extends Spiderman implements GwenStacyActionCallBacks{
    GwenStacy(String name, String alias, String gender, String identity, String occupation) {
        super(name, alias, gender, identity, occupation);
    }

    @Override
    public void ShootWeb(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), Color.blue);
        s.out("Lanzo telaraña \n","Helvetica",28,Color.MAGENTA);
        s.showImage("assets/ShootWeb.png");
        s.setBounds(200,100,900,600);


    }
}
