package co.com.sofka.administracion.events;

import co.com.sofka.administracion.values.Binoculares;
import co.com.sofka.administracion.values.IdGuia;
import co.com.sofka.domain.generic.DomainEvent;

public class AsignadoBinocularAGuia extends DomainEvent {
    private final IdGuia idGuia;
    private final Binoculares binoculares;

    public AsignadoBinocularAGuia(IdGuia idGuia, Binoculares binoculares){
        super("sofka.administracion.asignadobinocularaguia");
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
