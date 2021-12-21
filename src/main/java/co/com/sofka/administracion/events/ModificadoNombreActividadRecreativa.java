package co.com.sofka.administracion.events;

import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoNombreActividadRecreativa extends DomainEvent {
    private final String nombre;

    public ModificadoNombreActividadRecreativa(String nombre) {
        super("sofka.administracion.modificadonombreactividadrecreativa");
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
