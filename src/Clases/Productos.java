package Clases;

public class Productos {

    String nombre;
    int codigo;
    String cod_cat;
    int contenido;
    String laboratorio;
    String fecha_prod;
    String fecha_venc;
    Double precio;
    int stock;
    String fecha_ingreso;

    public Productos(String nombre, int codigo, String cod_cat, int contenido, String laboratorio, String fecha_prod, String fecha_venc, Double precio, int stock, String fecha_ingreso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cod_cat = cod_cat;
        this.contenido = contenido;
        this.laboratorio = laboratorio;
        this.fecha_prod = fecha_prod;
        this.fecha_venc = fecha_venc;
        this.precio = precio;
        this.stock = stock;
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCod_cat() {
        return cod_cat;
    }

    public void setCod_cat(String cod_cat) {
        this.cod_cat = cod_cat;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getFecha_prod() {
        return fecha_prod;
    }

    public void setFecha_prod(String fecha_prod) {
        this.fecha_prod = fecha_prod;
    }

    public String getFecha_venc() {
        return fecha_venc;
    }

    public void setFecha_venc(String fecha_venc) {
        this.fecha_venc = fecha_venc;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
//---
}
