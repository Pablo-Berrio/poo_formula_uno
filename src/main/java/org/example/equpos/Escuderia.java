package org.example.equpos;

import java.util.Objects;

public class Escuderia {

    private String nombre;
    private String motor;
    private String piloto;
    private Integer costoAnual;

    public Escuderia() {
    }

    public Escuderia(String nombre, String motor, String piloto, Integer costoAnual) {
        this.nombre = nombre;
        this.motor = motor;
        this.piloto = piloto;
        this.costoAnual = costoAnual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public Integer getCostoAnual() {
        return costoAnual;
    }

    public void setCostoAnual(Integer costoAnual) {
        this.costoAnual = costoAnual;
    }

    @Override
    public String toString() {
        return "Escuderia{" +
                "nombre='" + nombre + '\'' +
                ", motor='" + motor + '\'' +
                ", piloto='" + piloto + '\'' +
                ", costoAnual=" + costoAnual +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Escuderia escuderia = (Escuderia) o;

        if (!Objects.equals(nombre, escuderia.nombre)) return false;
        if (!Objects.equals(motor, escuderia.motor)) return false;
        if (!Objects.equals(piloto, escuderia.piloto)) return false;
        return Objects.equals(costoAnual, escuderia.costoAnual);
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + (motor != null ? motor.hashCode() : 0);
        result = 31 * result + (piloto != null ? piloto.hashCode() : 0);
        result = 31 * result + (costoAnual != null ? costoAnual.hashCode() : 0);
        return result;
    }
}
