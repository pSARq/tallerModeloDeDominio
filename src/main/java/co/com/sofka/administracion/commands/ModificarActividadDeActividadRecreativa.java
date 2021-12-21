package co.com.sofka.administracion.commands;

import co.com.sofka.administracion.values.Actividad;
import co.com.sofka.administracion.values.IdAdministracion;
import co.com.sofka.domain.generic.Command;

import java.util.zip.DeflaterInputStream;

public class ModificarActividadDeActividadRecreativa extends Command {
    private final IdAdministracion idAdministracion;
    private final Actividad actividad;

    public ModificarActividadDeActividadRecreativa(IdAdministracion idAdministracion, Actividad actividad) {
        this.idAdministracion = idAdministracion;
        this.actividad = actividad;
    }

    public IdAdministracion getIdAdministracion() {
        return idAdministracion;
    }

    public Actividad getActividad() {
        return actividad;
    }
}
