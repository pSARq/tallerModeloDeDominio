package co.com.sofka.administracion;

import co.com.sofka.administracion.values.Actividad;
import co.com.sofka.administracion.values.IdActividadRecreativa;
import co.com.sofka.administracion.values.Material;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class ActividadRecreativa extends Entity<IdActividadRecreativa> {

    private String nombre;
    private Material material;
    private Actividad actividad;

    public ActividadRecreativa(IdActividadRecreativa entityId, String nombre, Material material, Actividad actividad) {
        super(entityId);
        this.nombre = nombre;
        this.material = material;
        this.actividad = actividad;
    }

    public void modificarNombre(String nombre){
        if (nombre.isBlank()){
            new IllegalArgumentException("El nombre no puede estar vacio");
        }
        this.nombre = nombre;
    }

    public void modificarMaterial(Material material){
        this.material = Objects.requireNonNull(material);
    }

    public void modificarActividad(Actividad actividad){
        this.actividad = Objects.requireNonNull(actividad);
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
