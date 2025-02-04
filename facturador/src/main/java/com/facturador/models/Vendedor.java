package com.facturador.models;

import java.util.ArrayList;

public class Vendedor extends Persona{

    public Vendedor(String nombre, Long dpi) {
        super(nombre, dpi);
    }
    
    public boolean ValidarCliente(Long dpi){
        throw new IllegalStateException("");
    }

    public void PrepararFactura(ArrayList<Producto> productos, double dinero){
        throw new IllegalStateException("");
    }

    public boolean ValidarDinero(ArrayList<Producto> productos, double dinero){
        throw new IllegalStateException("");
    }

    public void EmitirFactura(){
        throw new IllegalStateException("");
    }
}
