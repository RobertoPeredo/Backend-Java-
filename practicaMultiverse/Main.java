package practicaMultiverse;

import imonsh.Screen;

public class Main {

  public static void main(String[] args) throws InterruptedException {


        Screen screen=new Screen();


        MilesMorales milesMorales = new MilesMorales("Miles Morales",
                "Spider-Man", "Masculino", "Secreta", "Artista/Estudiante");

        PeterParker peterParker = new PeterParker("Peter Parker","Spider-Man",
                "Masculino","Publica","Estudiante");

        GwenStacy gwenStacy = new GwenStacy("Gwen Stacy","Spider-Woman","Femenino",
                "Secreta","Estudiante de musica");

        milesMorales.Camouflage(screen);
        Thread.sleep(3000);
        milesMorales.VenomStrike(screen);
        Thread.sleep(3000);



        peterParker.SpiderSense(screen);
        Thread.sleep(3000);
        peterParker.WallCrawling(screen);
        Thread.sleep(3000);

        gwenStacy.ShootWeb(screen);
        Thread.sleep(3000);

        
    }
}
