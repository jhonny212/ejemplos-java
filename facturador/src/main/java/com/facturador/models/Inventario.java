package com.facturador.models;

public class Inventario extends ProductoInventario {

    private int Stock;

    public Inventario(String description, double precio, String codigo, int stock) {
        super(description, precio, codigo);
        this.Stock = stock;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        this.Stock = stock;
    }

}
