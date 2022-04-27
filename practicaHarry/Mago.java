package practicaHarry;

public class Mago {
    String casa, genero, nombre,boggart,patronus;

    Mago(String casa, String genero, String nombre, String boggart, String patronus)
    {
        this.casa=casa;
        this.genero=genero;
        this.nombre=nombre;
        this.boggart=boggart;
        this.patronus=patronus;
    }


    public String getCasa() {return casa;}
    public String getGenero() {return genero;}
    public String getNombre() {return nombre;}
    public String getBoggart() {return boggart;}
    public String getPatronus() {return patronus;}

    public boolean setCasa(String casa){
        if(!casa.isEmpty()){
            this.casa=casa;
            return true;
        }else
            return false;
    }
    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero=genero;
            return true;
        }else
            return false;
    }
    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        }else
            return false;
    }
    public boolean setBoggart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart=boggart;
            return true;
        }else
            return false;
    }
    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus=patronus;
            return true;
        }else
            return false;
    }




    public String showMessage(){
        return "\nHola soy " +getNombre()+ ", estas son mis caracteristicas: "+
                            "\nCasa: "+getCasa()+
                            "\nGenero: "+getGenero()+
                            "\nBoggart: "+getBoggart()+
                            "\nPatronus: "+getPatronus();
    }
}
