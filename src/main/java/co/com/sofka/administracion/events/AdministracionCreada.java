package co.com.sofka.administracion.events;

import co.com.sofka.administracion.values.IdAdministracion;
import co.com.sofka.domain.generic.DomainEvent;

public class AdministracionCreada extends DomainEvent {
    private final IdAdministracion idAdministracion;
    public AdministracionCreada(IdAdministracion idAdministracion){
        super("sofka.administracion.administracioncreada");
        this.idAdministracion = idAdministracion;
    }

    public IdAdministracion getIdAdministracion(){
        return idAdministracion;
    }
}
