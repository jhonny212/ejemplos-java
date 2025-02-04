package com.facturador.models;

public class Producto extends ProductoInventario{
    private int Cantidad;

    public Producto(String description, double precio, String codigo, int cantidad) {
        super(description, precio, codigo);
        this.Cantidad = cantidad;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    
}
