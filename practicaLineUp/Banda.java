package practicaLineUp;

import imonsh.Screen;

public class Banda {

    private String nombre,genero, album;


    Banda(String nombre, String genero, String album)
    {
        this.nombre=nombre;
        this.genero=genero;
        this.album=album;

    }


    //getters
    public String getName() {return nombre;}
    public String getGenero() {return genero;}
    public String getAlbum() {return album;}

    //setters

    public boolean setName(String nombre){
        if(!nombre.isEmpty()){
            this.nombre=nombre;
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
    public boolean setAlbum(String album){
        if(!album.isEmpty()){
            this.album=album;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return "\nA continuación se presenta la banda: " +getName()+
                "\nGenero: "+getGenero()+
                "\nPresentando su albúm: "+getAlbum();

    }

}
