package com.facturador.models;

public class Persona {
    private String Nombre;
    private Long Dpi;

    public Persona(String nombre, Long dpi) {
        this.Nombre = nombre;
        this.Dpi = dpi;
    }
    
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public Long getDpi() {
        return Dpi;
    }
    public void setDpi(Long dpi) {
        Dpi = dpi;
    }

    
}
