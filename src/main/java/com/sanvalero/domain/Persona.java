package com.sanvalero.domain;

public class Persona {
    private final String id;
    private final String nombre;
    private final String apellido;
    private final String dni;
    private final String telefono;
    private final String email;

    public Persona(String id, String nombre, String apellido, String dni, String telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDNI(){
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    // Comprueba si dos personas son iguales basado en si tienen el mismo número de DNI
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

        Persona other = (Persona) obj;
        if (!this.dni.equals(other.getDNI())) {
            return false;
        }
        return true;
    }
}
