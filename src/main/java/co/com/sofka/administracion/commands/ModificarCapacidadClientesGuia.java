package co.com.sofka.administracion.commands;

import co.com.sofka.administracion.values.IdAdministracion;
import co.com.sofka.administracion.values.IdGuia;
import co.com.sofka.domain.generic.Command;

public class ModificarCapacidadClientesGuia extends Command {
    private final IdAdministracion idAdministracion;
    private final IdGuia idGuia;
    private final int capacidadClientes;

    public ModificarCapacidadClientesGuia(IdAdministracion idAdministracion, IdGuia idGuia, int capacidadClientes) {
        this.idAdministracion = idAdministracion;
        this.idGuia = idGuia;
        this.capacidadClientes = capacidadClientes;
    }

    public IdAdministracion getIdAdministracion() {
        return idAdministracion;
    }

    public IdGuia getIdGuia() {
        return idGuia;
    }

    public int getCapacidadClientes() {
        return capacidadClientes;
    }
}
