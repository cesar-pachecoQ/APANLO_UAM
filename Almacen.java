package APANLOO.Practica3.Tienda;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private List<Producto> productos;

    public Almacen() {
        this.productos = new ArrayList<>();
    }

    public Almacen(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Producto eliminarProducto(Producto producto) {
        for (Producto p : productos) {
            if (p.getSerie().equals(producto.getSerie())) {
                productos.remove(p);
                return p;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Almacen [productos=" + productos + "]";
    }

}
