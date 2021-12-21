package co.com.sofka.administracion.commands;

import co.com.sofka.administracion.values.IdAdministracion;
import co.com.sofka.domain.generic.Command;

public class ModificarNombreActividadRecreativa extends Command {
    private final IdAdministracion idAdministracion;
    private final String nombre;

    public ModificarNombreActividadRecreativa(IdAdministracion idAdministracion, String nombre) {
        this.idAdministracion = idAdministracion;
        this.nombre = nombre;
    }

    public IdAdministracion getIdAdministracion() {
        return idAdministracion;
    }

    public String getNombre() {
        return nombre;
    }
}
