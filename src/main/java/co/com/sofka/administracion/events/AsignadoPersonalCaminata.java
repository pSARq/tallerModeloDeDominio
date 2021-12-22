package co.com.sofka.administracion.events;

import co.com.sofka.administracion.ActividadRecreativa;
import co.com.sofka.administracion.Guia;
import co.com.sofka.caminata.values.IdCaminata;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gerenteRedesSociales.Cliente;
import co.com.sofka.gerenteRedesSociales.values.IdCliente;
import co.com.sofka.gerenteRedesSociales.values.IdGerenteRedesSociales;

import java.util.Set;

public class AsignadoPersonalCaminata extends DomainEvent {

    private  final IdCaminata idCaminata;
    private final IdGerenteRedesSociales idGerenteRedesSociales;
    private final Set<Guia> guias;
    private final ActividadRecreativa actividadRecreativa;

    public AsignadoPersonalCaminata(IdCaminata idCaminata, IdGerenteRedesSociales idGerenteRedesSociales, Set<Guia> guias, ActividadRecreativa actividadRecreativa) {
        super("sofka.administracion.asignadopersonalcaminata");
        this.idCaminata = idCaminata;
        this.idGerenteRedesSociales = idGerenteRedesSociales;
        this.guias = guias;
        this.actividadRecreativa = actividadRecreativa;
    }

    public IdCaminata getIdCaminata() {
        return idCaminata;
    }

    public IdGerenteRedesSociales getIdGerenteRedesSociales() {
        return idGerenteRedesSociales;
    }

    public Set<Guia> getGuias() {
        return guias;
    }

    public ActividadRecreativa getActividadRecreativa() {
        return actividadRecreativa;
    }


}
