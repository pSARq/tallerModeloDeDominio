package co.com.sofka.administracion;

import co.com.sofka.administracion.values.Binoculares;
import co.com.sofka.administracion.values.IdGuia;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Guia extends Entity<IdGuia> {

    private String nombre;
    private int capacidadClientes;
    private Binoculares binoculares;

    public Guia(IdGuia entityId, String nombre, int capacidadClientes) {
        super(entityId);
        this.nombre = nombre;
        this.capacidadClientes = capacidadClientes;
    }

    public void modificarCapacidadClientes(int capacidadClientes){
        if (capacidadClientes <= 0){
            new IllegalArgumentException("La capacidad de clientes del guia debe ser mayor de 0");
        }
        this.capacidadClientes = capacidadClientes;
    }

    public void asignarBinoculares(Binoculares binoculares){
        this.binoculares = Objects.requireNonNull(binoculares);
    }

    //Puede ser nulo
    public void modificarBinoculares(Binoculares binoculares){
        this.binoculares = binoculares;
    }

    public int capacidadClientes() {
        return capacidadClientes;
    }

    public String nombre() {
        return nombre;
    }
}
