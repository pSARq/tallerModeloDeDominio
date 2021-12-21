package co.com.sofka.administracion.events;

import co.com.sofka.administracion.values.Actividad;
import co.com.sofka.administracion.values.IdActividadRecreativa;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadaActividadDeActividadRecreativa extends DomainEvent{
    private final Actividad actividad;
    public ModificadaActividadDeActividadRecreativa(Actividad actividad) {
        super("sofka.administracion.modificadaactividaddeactividadrecreativa");
        this.actividad = actividad;
    }

    public Actividad getActividad() {
        return actividad;
    }
}
