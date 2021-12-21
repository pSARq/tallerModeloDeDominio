package co.com.sofka.administracion.commands;

import co.com.sofka.administracion.values.Actividad;
import co.com.sofka.administracion.values.IdActividadRecreativa;
import co.com.sofka.administracion.values.IdAdministracion;
import co.com.sofka.administracion.values.Material;
import co.com.sofka.domain.generic.Command;


public class SeleccionarActividadRecreativa extends Command {
    private final IdAdministracion idAdministracion;
    private final IdActividadRecreativa idActividadRecreativa;
    private final String nombre;
    private final Material material;
    private final Actividad actividad;


    public SeleccionarActividadRecreativa(IdAdministracion idAdministracion, IdActividadRecreativa idActividadRecreativa, String nombre, Material material, Actividad actividad) {
        this.idAdministracion = idAdministracion;
        this.idActividadRecreativa = idActividadRecreativa;
        this.nombre = nombre;
        this.material = material;
        this.actividad = actividad;
    }

    public IdAdministracion getIdAdministracion() {
        return idAdministracion;
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

