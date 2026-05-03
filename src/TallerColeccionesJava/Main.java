package TallerColeccionesJava;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("L001","La Carta a García",1899,"Elbert Hubbard","9781440685392");

        Revista revista1 = new Revista("R001","National Geographic",2023,154,"Ciencia/Naturaleza");

        libro1.mostrarInfo();
        revista1.mostrarInfo();
    }
}
