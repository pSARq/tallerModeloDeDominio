package co.com.sofka.administracion;

import co.com.sofka.administracion.events.AdministracionCreada;
import co.com.sofka.administracion.values.IdAdministracion;
import co.com.sofka.caminata.values.IdCaminata;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.gerenteRedesSociales.values.IdGerenteRedesSociales;

import java.util.Set;


public class Administracion extends AggregateEvent<IdAdministracion> {

    protected IdCaminata idcaminata;
    protected IdGerenteRedesSociales idGerenteRedesSociales;
    protected Set<Guia> guias;
    protected Set<ActividadRecreativa> actividadesRecreativas;

    public Administracion(IdAdministracion entityId, IdGerenteRedesSociales idGerenteRedesSociales) {
        super(entityId);
        appendChange(new AdministracionCreada(entityId)).apply();
    }
}
