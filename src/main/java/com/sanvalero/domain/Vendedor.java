package com.sanvalero.domain;

public class Vendedor extends Persona{
    private final float sueldo;
    private int cochesVendidos;

    public Vendedor(String id, String nombre, String apellido, String dni, String telefono, String email, float sueldo) {
        super(id, nombre, apellido, dni, telefono, email);
        this.sueldo = sueldo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public int getCochesVendidos() {
        return cochesVendidos;
    }

    public void setCochesVendidos(int cochesVendidos) {
        this.cochesVendidos = cochesVendidos;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "ID = " + getId() +
                ", nombre = " + getNombre() +
                ", apellido = " + getApellido() +
                ", DNI = " + getDNI() +
                ", telefono = " + getTelefono() +
                ", email = " + getEmail() +
                ", sueldo = " + sueldo +
                ", cochesVendidos = " + cochesVendidos +
                '}';
    }
}
