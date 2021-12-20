package co.com.sofka.administracion;

import co.com.sofka.administracion.values.IdAdministracion;
import co.com.sofka.domain.generic.AggregateEvent;

public class Administracion extends AggregateEvent<IdAdministracion> {

    public Administracion(IdAdministracion entityId) {
        super(entityId);
    }
}
