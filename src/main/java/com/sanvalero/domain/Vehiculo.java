package com.sanvalero.domain;

public class Vehiculo {

    private final String id;
    private final String matricula;
    private final String marca;
    private final String modelo;
    private final String tipo;
    private final int caballos;
    private float precio;

    public Vehiculo(String id, String matricula, String marca, String modelo, String tipo, int caballos) {
        this.id = id;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.caballos = caballos;
    }

    public String getId() {
        return id;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCaballos() {
        return caballos;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Vehiculo other = (Vehiculo) obj;
        if (!this.matricula.equals(other.getMatricula())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "ID ='" + id + '\'' +
                ", matricula ='" + matricula + '\'' +
                ", marca ='" + marca + '\'' +
                ", modelo ='" + modelo + '\'' +
                ", tipo ='" + tipo + '\'' +
                ", caballos =" + caballos +
                ", precio =" + precio +
                '}';
    }
}
