package co.com.sofka.administracion.commands;

import co.com.sofka.administracion.values.Binoculares;
import co.com.sofka.administracion.values.IdAdministracion;
import co.com.sofka.administracion.values.IdGuia;
import co.com.sofka.domain.generic.Command;

public class ModificarBinocularesGuia extends Command {
    private final IdAdministracion idAdministracion;
    private final IdGuia idGuia;
    private final Binoculares binoculares;

    public ModificarBinocularesGuia(IdAdministracion idAdministracion, IdGuia idGuia, Binoculares binoculares) {
        this.idAdministracion = idAdministracion;
        this.idGuia = idGuia;
        this.binoculares = binoculares;
    }

    public IdAdministracion getIdAdministracion() {
        return idAdministracion;
    }

    public IdGuia getIdGuia() {
        return idGuia;
    }

    public Binoculares getBinoculares() {
        return binoculares;
    }
}
