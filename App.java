package APANLOO.Practica3.Tienda;

import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Producto p1 = new Producto("205045", "Galletas", "Oreo", 2, 25);
        Producto p2 = new Producto("505046", "Leche", "Alpura", 1, 28);
        Producto p3 = new Producto("695047", "Galletas", "Marias", 0, 15);
        Producto p4 = new Producto("280648", "Leche", "Lala", 1, 28);
        Producto p5 = new Producto("278049", "Yogurt", "Danone", 2, 17);
        Producto p6 = new Producto("803050", "Jugo", "Boing", 1, 15);
        Producto p7 = new Producto("360805", "Agua", "Ciel", 3, 10);

        BBB bbb = new BBB();
        bbb.agregarProducto(p1);
        bbb.agregarProducto(p2);
        bbb.agregarProducto(p3);
        bbb.agregarProducto(p4);
        bbb.agregarProducto(p5);
        bbb.agregarProducto(p6);
        bbb.agregarProducto(p7);

        System.out.println("Productos en la tienda:");
        System.out.println(bbb.obtenerProductos());

        System.out.println("Productos con nombre 'Galletas':");
        System.out.println(bbb.buscarProductosPorNombre("Galletas"));

        System.out.println("Producto con serie '695047':");
        System.out.println(bbb.buscarProductoPorSerie("695047"));

        System.out.println("Productos con marca 'Alpura':");
        System.out.println(bbb.buscarProductosPorMarca("Alpura"));

        System.out.println("Vendiendo 1 unidades de 'Galletas Oreo':");
        System.out.println(bbb.venderProducto("205045", 1));

    }

}
