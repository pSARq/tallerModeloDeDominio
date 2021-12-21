package co.com.sofka.administracion.events;

import co.com.sofka.administracion.values.Binoculares;
import co.com.sofka.administracion.values.IdGuia;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoAsignacionBinocularesGuia extends DomainEvent {
    private final IdGuia idGuia;
    private final Binoculares binoculares;

    public ModificadoAsignacionBinocularesGuia(IdGuia idGuia, Binoculares binoculares){
        super("sofka.administracion.modificadaasignacionbinocularesguia");
        this.idGuia = idGuia;
        this.binoculares = binoculares;
    }

    public IdGuia getIdGuia() {
        return idGuia;
    }

    public Binoculares getBinoculares() {
        return binoculares;
    }
}
