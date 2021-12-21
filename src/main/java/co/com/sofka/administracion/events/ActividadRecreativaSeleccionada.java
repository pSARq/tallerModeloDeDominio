package co.com.sofka.administracion.events;

import co.com.sofka.administracion.ActividadRecreativa;
import co.com.sofka.administracion.values.Actividad;
import co.com.sofka.administracion.values.IdActividadRecreativa;
import co.com.sofka.administracion.values.Material;
import co.com.sofka.domain.generic.DomainEvent;

public class ActividadRecreativaSeleccionada extends DomainEvent {

    private final IdActividadRecreativa idActividadRecreativa;
    private final String nombre;
    private final Material material;
    private final Actividad actividad;

    public ActividadRecreativaSeleccionada(IdActividadRecreativa idActividadRecreativa, String nombre, Material material, Actividad actividad){
        super("sofka.administracion.actividadrecreativaseleccionada");
        this.idActividadRecreativa = idActividadRecreativa;
        this.nombre = nombre;
        this.material = material;
        this.actividad = actividad;
    }

    public IdActividadRecreativa getIdActividadRecreativa() {
        return idActividadRecreativa;
    }

    public String getNombre() {
        return nombre;
    }

    public Material getMaterial() {
        return material;
    }

    public Actividad getActividad() {
        return actividad;
    }
}
