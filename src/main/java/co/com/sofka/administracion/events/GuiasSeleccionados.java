package co.com.sofka.administracion.events;

import co.com.sofka.administracion.values.IdGuia;
import co.com.sofka.domain.generic.DomainEvent;

public class GuiasSeleccionados extends DomainEvent {

    private final IdGuia idGuia;
    private final String nombre;
    private final int capacidadClientes;

    public GuiasSeleccionados(IdGuia idGuia, String nombre, int capacidadClientes) {
        super("sofka.administracion.guiasseleccionados");
        this.idGuia = idGuia;
        this.nombre = nombre;
        this.capacidadClientes = capacidadClientes;
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
