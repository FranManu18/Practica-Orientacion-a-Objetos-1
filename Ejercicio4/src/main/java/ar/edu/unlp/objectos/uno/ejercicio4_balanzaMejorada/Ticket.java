package ar.edu.unlp.objectos.uno.ejercicio4_balanzaMejorada;
import java.time.LocalDate;
import java.util.*;
public class Ticket {
    private LocalDate fecha;
    private double pesoTotal;
    private double precioTotal;
    private int cantidadDeProductos;
    
    public Ticket(List<Producto> productos) {
        this.fecha = LocalDate.now();
        this.pesoTotal = productos.stream().mapToDouble(Producto::getPeso).sum();
        this.precioTotal = productos.stream().mapToDouble(Producto::getPrecio).sum();
        this.cantidadDeProductos = productos.size();
    }

    public int getCantidadDeProductos() {
        return cantidadDeProductos;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }
    
    public double getImpuesto() {
        return this.precioTotal * 0.21;
    }
    
    public double getPesoTotal() {
        return pesoTotal;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }
}

