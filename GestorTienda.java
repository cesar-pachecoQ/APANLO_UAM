package APANLOO.Practica3.Tienda;

import java.util.List;

public interface GestorTienda {
    void agregarProducto(Producto P);

    List<Producto> obtenerProductos();

    List<Producto> buscarProductosPorNombre(String nombre);

    Producto buscarProductoPorSerie(String serie);

    List<Producto> buscarProductosPorMarca(String marca);

    Producto venderProducto(String serie, int cantidad);

}
