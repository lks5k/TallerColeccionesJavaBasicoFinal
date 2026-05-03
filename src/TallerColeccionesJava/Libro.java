package TallerColeccionesJava;

public class Libro extends Material {
    private String Autor;
    private String isbn;

    public Libro(String codigo, String titulo, int anio, String autor, String isbn) {
        super(codigo, titulo, anio);
        Autor = autor;
        this.isbn = isbn;
    }

    @Override
    public String getTipo() {
        return "Libro";
    }
}
