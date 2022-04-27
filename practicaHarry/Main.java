package practicaHarry;

public class Main {
    public static void main(String[] args) {
        Mago harry= new Mago("Gryffindor", "Masculino","Harry Potter", "Dementor","Ciervo");
        Mago ron = new Mago("Gryffindor", "Masculino","Ron Weasly", "Acromantula","Jack Russel Terrier");
        Mago hermione = new Mago("Gryffindor", "Femenino","Hermione", "MCgonagal","Nutria");
        Mago albus = new Mago("Gryffindor", "Masculino","Albus Dumbleadore", "Mi hermana","Fenix");
        Mago remus = new Mago("Gryffindor", "Masculino","Remus Lupin", "Luna llena","Lonbo");

        System.out.println(harry.showMessage());
        System.out.println(ron.showMessage());
        System.out.println(hermione.showMessage());
        System.out.println(albus.showMessage());
        System.out.println(remus.showMessage());
    }
}
