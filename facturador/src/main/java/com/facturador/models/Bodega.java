package com.facturador.models;

import java.util.ArrayList;

public class Bodega {

    //Azucar
    //sal
    //Leche
    //cereal
    public ArrayList<Inventario> InventarioProducots = new ArrayList<>();

    public int ValidarInventario(String codigoProducto, int cantidad) {
        //Dado un codigo validar la existencia en el listado de inventario products
        //Buscar entre el listado el codigo product solicitado
        for (int i = 0; i < this.InventarioProducots.size(); i++) {
            Inventario item = this.InventarioProducots.get(i);

            //Busco dado el codigo
            if(item.getCodigo().equals(codigoProducto)){
                //Si tenemos existencia suficiente a la cantidad retornar la cantidad
                if(cantidad >= item.getStock()){
                    return cantidad;
                }else{
                    return item.getStock();
                }
                //De lo contrario retornar lo disponible
            }
        }
        return 0;
    }

    public void ActualizarInventario(ArrayList<Producto> productos){
        throw new IllegalStateException("");
    }
}
