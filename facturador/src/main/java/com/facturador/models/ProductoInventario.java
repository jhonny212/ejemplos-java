package com.facturador.models;

public class ProductoInventario {
    private String Description;
    private double Precio;
    private String Codigo;

    public ProductoInventario(String description, double precio, String codigo) {
        this.Description = description;
        this.Precio = precio;
        this.Codigo = codigo;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

}
