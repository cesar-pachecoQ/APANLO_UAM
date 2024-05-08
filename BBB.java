package APANLOO.Practica3.Tienda;

import java.util.List;
import java.util.ArrayList;

public class BBB implements GestorTienda {

    Almacen miAlmacen = new Almacen(new ArrayList<Producto>());

    @Override
    public void agregarProducto(Producto P) {
        miAlmacen.getProductos().add(P);
        P.setCantidad(P.getCantidad() + 1);
    }

    @Override
    public List<Producto> obtenerProductos() {
        return miAlmacen.getProductos();
    }

    @Override
    public List<Producto> buscarProductosPorNombre(String nombre) {
        List<Producto> productosEncontrados = new ArrayList<Producto>();
        for (Producto producto : miAlmacen.getProductos()) {
            if (producto.getNombre().equals(nombre)) {
                productosEncontrados.add(producto);
            }
        }
        return productosEncontrados;
    }

    @Override
    public Producto buscarProductoPorSerie(String serie) {
        for (Producto producto : miAlmacen.getProductos()) {
            if (producto.getSerie().equals(serie)) {
                return producto;
            }
        }
        throw new UnsupportedOperationException("Producto no encontrado");
    }

    @Override
    public List<Producto> buscarProductosPorMarca(String marca) {
        List<Producto> productosEncontrados = new ArrayList<Producto>();
        for (Producto producto : miAlmacen.getProductos()) {
            if (producto.getMarca().equals(marca)) {
                productosEncontrados.add(producto);
            }
        }
        return productosEncontrados;
    }

    @Override
    public Producto venderProducto(String serie, int cantidad) {
        Producto producto = buscarProductoPorSerie(serie);
        if (producto.getCantidad() >= cantidad) {
            producto.setCantidad(producto.getCantidad() - cantidad);
            return producto;
        }
        throw new UnsupportedOperationException("No hay suficiente stock");
    }

}
