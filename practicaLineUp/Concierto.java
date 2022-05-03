package practicaLineUp;

import imonsh.Screen;


public class Concierto {

    public static void main(String[] args) {
        Screen img = new Screen();
        Screen img2= new Screen();


        Banda coldplay = new Coldplay("Coldplay","Pop rock","Third Man Records");
        Banda maroon5 = new Maroon5("Maroon5"," Alternativa/independiente","Songs About Jane");
        Banda theKillers = new TheKillers("TheKillers","Rock alternativo","Hot Fuss");


        Thread Img= new Thread( new Imagen(maroon5,img));
        Thread Text = new Thread(new Texto(maroon5,img2));
        Thread Music= new Thread(new Musica(maroon5));

        //Thread coldplay= new Thread( new Coldplay("Coldplay","Pop","NO sé2",cold));
        Img.start();
        Text.start();
        Music.start();
        try {
            // Pausa entre paginas
            Thread.sleep(8100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       Img = new Thread(new Imagen(coldplay,img));
       Text = new Thread(new Texto(coldplay,img2));
       Music= new Thread(new Musica(coldplay));

       Img.start();
        Text.start();
        Music.start();
        try {
            // Pausa entre paginas
            Thread.sleep(8100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Img = new Thread(new Imagen(theKillers,img));
        Text = new Thread(new Texto(theKillers,img2));
        Music= new Thread(new Musica(theKillers));

        Img.start();
        Text.start();
        Music.start();
    }


}
