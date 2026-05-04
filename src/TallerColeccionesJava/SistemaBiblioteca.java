package TallerColeccionesJava;

import java.util.HashMap;
import java.util.Map;

public class SistemaBiblioteca {
    private Map<String, Material> catalogo = new HashMap<>();

    public void registrarMaterial(Material m) {
        catalogo.put(m.getCodigo(), m);
    }

    public Material buscarMaterial(String codigo) {
        return catalogo.get(codigo);
    }

}
