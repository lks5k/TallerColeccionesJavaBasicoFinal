package TallerColeccionesJava;

public abstract class Material implements Catalogable {
    private String codigo;
    private String titulo;
    private int anio;
    private boolean disponible;

    public Material(String codigo, String titulo, int anio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anio = anio;
        this.disponible = true;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    public abstract String getTipo();

    public void mostrarInfo(){
        String estado = disponible ? "Disponible" : "Prestado";
        System.out.println(getTipo() + " | " + titulo + " | " + anio + " | " + estado);
    }
}
