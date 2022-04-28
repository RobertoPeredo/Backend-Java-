package practicaMona;

public class Main {
    public static void main(String[] args) {

        Boxertocat boxertocat = new Boxertocat("Boxertocat",139);
        Surftocat surftocat = new Surftocat("Surftocat",138);
        Scubatocat scubatocat = new Scubatocat("Scubatocat",136);
        Skatetocat skatetocat = new Skatetocat("Skatetocat",124);
        Investocat investocat = new Investocat("Investocat",119);
        Goretocat goretocat = new Goretocat("Goretocat",93);


        System.out.println(boxertocat.showMessage());
        boxertocat.accion();

        System.out.println(surftocat.showMessage());
        surftocat.accion();

        System.out.println(scubatocat.showMessage());
        scubatocat.accion();

        System.out.println(skatetocat.showMessage());
        skatetocat.accion();

        System.out.println(investocat.showMessage());
        investocat.accion();

        System.out.println(goretocat.showMessage());
        goretocat.accion();




    }
}
