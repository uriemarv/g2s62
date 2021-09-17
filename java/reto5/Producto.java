/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5;

/**
 *
 * @author urielmartinez
 */
public class Producto {
    private int id;
    private String nombre;
    private int cantidad;
    private Categoria categoria;
    private double precio;

    public Producto() {
    }

    public Producto(String nombre, int cantidad, Categoria categoria, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.precio = precio;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void crearProducto(){
        
    }
    
    public void consultarProducto(){
        
    }
    
    public void listarProducto(){
        
    }
    
    public void actualizarProducto(){
        
        
    }
    
    public void eliminarProducto(){
        
    }
    
    
}
