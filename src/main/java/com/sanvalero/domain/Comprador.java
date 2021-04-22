package com.sanvalero.domain;

public class Comprador extends Persona {
    private float importe;
    private int cochesComprados;

    public Comprador(String id, String nombre, String apellido, String dni, String telefono, String email, float importe) {
        super(id, nombre, apellido, dni, telefono, email);
        this.importe = importe;
    }

    public float getImporte() {
        return importe;
    }

    public int getCochesComprados() {
        return cochesComprados;
    }

    public void setCochesComprados(int cochesComprados) {
        this.cochesComprados = cochesComprados;
    }


}
