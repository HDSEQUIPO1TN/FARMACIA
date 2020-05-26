package Clases;

import java.util.ArrayList;

public class Almacen {

    private ArrayList<Productos> listado;

    public Almacen() {
        this.listado = new ArrayList<>();
    }

    public void agregarProductos(String nombre, int codigo, String cod_cat, int contenido,
            String laboratorio, String fecha_prod, String fecha_venc, Double precio, int stock, String fecha_ingreso) {
        Productos c = new Productos(nombre, codigo, cod_cat, contenido, laboratorio, fecha_prod, fecha_venc, precio, stock, fecha_ingreso);
        this.listado.add(c);
    }

    public String buscarProductos(String nombreBuscado) {
        String s = "";
        for (Productos c : this.listado) {
            if (c.getNombre().toUpperCase().contains(nombreBuscado.toUpperCase())) {
                s += "\nProducto: " + c.getNombre() + "\nPRECIO: " + c.getPrecio() + "\nCODIGO: " + c.getCodigo()
                        + "\nCODIGO DE CATALOGO" + c.getCod_cat() + "\nCONTENIDO: " + c.getContenido() + "\nLABORATORIO: "
                        + c.getLaboratorio() + "\nFECHA DE PRODUCCIÓN: " + c.getFecha_prod() + "\nFECHA DE VENCIMIENTO: "
                        + c.getFecha_venc() + "\nSTOCK: " + c.getStock() + "\nFECHA DE INGRESO A ALMACEN: " + c.getFecha_ingreso();
            }
        }
        return s;
    }

    public String buscarProductos(int numero) {
        numero--;
        if (numero >= this.listado.size() || numero < 0) {
            return "Producto no encontrado";
        }
        Productos c = this.listado.get(numero);
        return c.getNombre();
    }

    public void eliminarProductos(int numero) {
        numero--;
        if (numero >= this.listado.size() || numero < 0) {
            return;
        }

        this.listado.remove(numero);
    }

    public String obtenerListado() {
        String s = "";
        int idx = 1;
        for (Productos c : this.listado) {
            s += "\n (" + idx++ + ") " + c.getNombre() + "\nStock: " + c.getStock();
        }
        return s;
    }
}
