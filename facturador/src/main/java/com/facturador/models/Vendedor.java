package com.facturador.models;

import java.util.ArrayList;

public class Vendedor extends Persona {

    public Vendedor(String nombre, Long dpi) {
        super(nombre, dpi);
    }

    public boolean ValidarCliente(Long dpi) {
        // Que dpi > 0
        // Que entre solo numeros positivos
        if (dpi > 0) {
            // Que dpi tenga una longitud de 5 caracteres
            String dpiTexto = dpi.toString();
            if (dpiTexto.length() > 5) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    public void PrepararFactura(ArrayList<Producto> productos, double dinero) {
        //TODO
    }

    public boolean ValidarDinero(ArrayList<Producto> productos, double dinero) {
        // Validar si el "dinero" es suficiente a la suma de precio de los productos

        // Obtener la suma de los precios
        double sumaPrecios = 0;
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            sumaPrecios = sumaPrecios + producto.getPrecio();
        }

        // Comparar la suma precios con el dinero del cliente
        // Si dinero es mayor a suma precios 
        if(dinero >= sumaPrecios){
            return true;
        }else{
            return false;
        }
    }

    public void EmitirFactura() {
        //TOD
    }
}
