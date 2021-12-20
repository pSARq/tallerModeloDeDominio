package co.com.sofka.administracion;

import co.com.sofka.administracion.values.IdAdministracion;


public class Administracion extends AggregateEvent<IdAdministracion> {

    public Administracion(IdAdministracion entityId) {
        super(entityId);
    }
}
