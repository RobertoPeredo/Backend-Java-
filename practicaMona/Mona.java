package practicaMona;
public class Mona {

    String nombre;
    int id;


    //sobrecarga del operador
    Mona(String nombre, int id)
    {
        this.nombre=nombre;
        this.id=id;
    }

    //getters
    public String getNombre() {return nombre;}
    public int getId() {return id;}

    //setters
    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        }else
            return false;
    }

    public boolean setId(int id){
        if(id>0){
            this.id=id;
            return true;
        }else
            return false;
    }


    //Metodos
    public String showMessage(){
        return "\nHola soy Mona"+
                "\nEn esta ocasion mi personaje es: "+getNombre()+
                "\nY mi id es : "+ getId();
    }

}


