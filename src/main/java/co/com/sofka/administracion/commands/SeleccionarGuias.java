package co.com.sofka.administracion.commands;

import co.com.sofka.administracion.values.IdAdministracion;
import co.com.sofka.administracion.values.IdGuia;
import co.com.sofka.domain.generic.Command;

public class SeleccionarGuias extends Command {
    private final IdAdministracion idAdministracion;
    private final IdGuia idGuia;
    private final String nombre;
    private final int capacidadClientes;

    public SeleccionarGuias(IdAdministracion idAdministracion, IdGuia idGuia, String nombre, int capacidadClientes) {
        this.idAdministracion = idAdministracion;
        this.idGuia = idGuia;
        this.nombre = nombre;
        this.capacidadClientes = capacidadClientes;
    }

    public IdAdministracion getIdAdministracion() {
        return idAdministracion;
    }

    public IdGuia getIdGuia() {
        return idGuia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidadClientes() {
        return capacidadClientes;
    }
}
