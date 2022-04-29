package practicaMultiverse;

public class Spiderman {

    private String name,alias, gender, identity, occupation;

    Spiderman(String name, String alias, String gender, String identity, String occupation)
    {
        this.name=name;
        this.alias=alias;
        this.gender=gender;
        this.identity=identity;
        this.occupation=occupation;
    }


    public String getName() {return name;}
    public String getAlias() {return alias;}
    public String getGender() {return gender;}
    public String getIdentity() {return identity;}
    public String getOccupation() {return occupation;}

    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name=name;
            return true;
        }else
            return false;
    }
    public boolean setAlias(String alias){
        if(!alias.isEmpty()){
            this.alias=alias;
            return true;
        }else
            return false;
    }
    public boolean setGender(String gender){
        if(!gender.isEmpty()){
            this.gender=gender;
            return true;
        }else
            return false;
    }
    public boolean setIdentity(String identity){
        if(!identity.isEmpty()){
            this.identity=identity;
            return true;
        }else
            return false;
    }
    public boolean setOccupation(String occupation){
        if(!occupation.isEmpty()){
            this.occupation=occupation;
            return true;
        }else
            return false;
    }




    public String showMessage(){
        return "\nHola soy " +getName()+ ", estas son mis caracteristicas: "+
                "\nAlias: "+getAlias()+
                "\nGenero: "+getGender()+
                "\nMi identidad es: "+getIdentity()+
                "\nOcupacion: "+getOccupation()+"\n Estas son mis habilidades: \n";
    }
}
