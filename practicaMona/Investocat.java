package practicaMona;

public class Investocat extends Mona{
    Investocat(String nombre, int id) {
        super(nombre, id);
    }
    public void accion(){
        System.out.println("Cuidado, te estoy investigando...");
    }
}
