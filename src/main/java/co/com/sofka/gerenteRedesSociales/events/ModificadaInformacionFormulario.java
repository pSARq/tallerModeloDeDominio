package co.com.sofka.gerenteRedesSociales.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gerenteRedesSociales.values.IdFormulario;
import co.com.sofka.gerenteRedesSociales.values.Informacion;

public class ModificadaInformacionFormulario extends DomainEvent {

    private IdFormulario idFormulario;
    private Informacion informacion;

    public ModificadaInformacionFormulario(IdFormulario idFormulario, Informacion informacion){
        super("sofka.gerenteredessociales.gerenteredessocialescreado");
        this.idFormulario = idFormulario;
        this.informacion = informacion;
    }

    public IdFormulario getIdFormulario() {
        return idFormulario;
    }

    public Informacion getInformacion() {
        return informacion;
    }
}
