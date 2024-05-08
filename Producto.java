package APANLOO.Practica3.Tienda;

public class Producto {
    private String serie;
    private String nombre;
    private String marca;
    private int cantidad;
    private float precio;

    public Producto(String serie, String nombre, String marca, int cantidad, float precio) {
        this.serie = serie;
        this.nombre = nombre;
        this.marca = marca;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getStock() {
        return cantidad;
    }

    public void setStock(int i) {
        this.cantidad = i;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto [serie=" + serie + ", nombre=" + nombre + ", marca=" + marca + ", cantidad=" + cantidad
                + ", precio=" + precio + "]";
    }

}
