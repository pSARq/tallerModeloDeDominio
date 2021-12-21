package co.com.sofka.administracion.commands;

import co.com.sofka.administracion.ActividadRecreativa;
import co.com.sofka.administracion.Guia;
import co.com.sofka.administracion.values.IdAdministracion;
import co.com.sofka.caminata.values.IdCaminata;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.gerenteRedesSociales.values.IdCliente;

import java.util.Set;

public class AsignarPersonalCaminata extends Command {

    private final IdAdministracion idAdministracion;
    private final IdCaminata idCaminata;
    private final Set<Guia> guias;
    private final ActividadRecreativa actividadRecreativa;

    public AsignarPersonalCaminata(IdAdministracion idAdministracion, IdCaminata idCaminata, Set<Guia> guias, ActividadRecreativa actividadRecreativa) {
        this.idAdministracion = idAdministracion;
        this.idCaminata = idCaminata;
        this.guias = guias;
        this.actividadRecreativa = actividadRecreativa;
    }

    public IdAdministracion getIdAdministracion() {
        return idAdministracion;
    }

    public IdCaminata getIdCaminata() {
        return idCaminata;
    }

    public Set<Guia> getGuias() {
        return guias;
    }

    public ActividadRecreativa getActividadRecreativa() {
        return actividadRecreativa;
    }
}
