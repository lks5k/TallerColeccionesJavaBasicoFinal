package TallerColeccionesJava;

import java.util.*;

public class SistemaBiblioteca {
    private Map<String, Material> catalogo = new HashMap<>();

    public void registrarMaterial(Material m) {
        catalogo.put(m.getCodigo(), m);
    }

    public Material buscarMaterial(String codigo) {
        return catalogo.get(codigo);
    }

    public void mostrarCatalogo() {
        System.out.println("~~~~~~~~~~~~Catálogo de Materiales~~~~~~~~~~~~~~");
        for (Map.Entry<String, Material> entry : catalogo.entrySet()) {
            entry.getValue().mostrarInfo();
        }
    }

    private Map<String, List<String>> ListaEspera = new HashMap<>();

    public void anotarEnLista(String codigoMaterial, String usuario) {
        if (!ListaEspera.containsKey(codigoMaterial)) {
            ListaEspera.put(codigoMaterial, new ArrayList<>());
        }
        ListaEspera.get(codigoMaterial).add(usuario);
    }

    public String atenderSiguiente(String codigoMaterial) {
        List<String> fila = ListaEspera.get(codigoMaterial);
        if (fila != null && !fila.isEmpty()) {
            return fila.remove(0);
        }
        return null;
    }

    private Set<String> miembros = new HashSet<>();

    public boolean registrarMiembro(String usuario) {
        return miembros.add(usuario);
    }

    public boolean tieneMembresia(String usuario) {
        return miembros.contains(usuario);
    }
}
