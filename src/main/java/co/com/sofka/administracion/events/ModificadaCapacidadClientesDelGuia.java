package co.com.sofka.administracion.events;

import co.com.sofka.administracion.values.IdGuia;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadaCapacidadClientesDelGuia extends DomainEvent {

    private final IdGuia idGuia;
    private final int capacidadClientes;

    public ModificadaCapacidadClientesDelGuia(IdGuia idGuia, int capacidadClientes) {
        super("sofka.administracion.modificadacapacidadDelGuia");
        this.idGuia = idGuia;
        this.capacidadClientes = capacidadClientes;
    }

    public IdGuia getIdGuia() {
        return idGuia;
    }

    public int getCapacidadClientes() {
        return capacidadClientes;
    }
}
