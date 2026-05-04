package TallerColeccionesJava;

public class Main {
    public static void main(String[] args) {
        SistemaBiblioteca sistema = new SistemaBiblioteca();

        Libro libro1 = new Libro("L001","La Carta a García",1899,"Elbert Hubbard","9781440685392");
        Revista revista1 = new Revista("R001","National Geographic",2023,154,"Ciencia/Naturaleza");

        sistema.registrarMaterial(libro1);
        sistema.registrarMaterial(revista1);

        sistema.mostrarCatalogo();

        System.out.println("\n--- Gestionando fila de espera para L001 ---");
        sistema.anotarEnLista("L001", "Usuario_A");
        sistema.anotarEnLista("L001", "Usuario_B");

        String siguiente = sistema.atenderSiguiente("L001");
        System.out.println("Se le entrega el material a: " + siguiente);

        System.out.println("\n--- Verificando Membresías ---");
        System.out.println("Registro de 'Juan Pérez': " + sistema.registrarMiembro("Juan Pérez"));
        System.out.println("Intento duplicado 'Juan Pérez': " + sistema.registrarMiembro("Juan Pérez"));
        System.out.println("¿Tiene membresía 'Juan Pérez'?: " + sistema.tieneMembresia("Juan Pérez"));
    }
}