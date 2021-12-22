package co.com.sofka.gerenteRedesSociales;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.gerenteRedesSociales.values.*;

import java.util.Objects;

public class Formulario extends Entity<IdFormulario> {

    private Informacion informacion;

    public Formulario(IdFormulario entityId, Informacion informacion) {
        super(entityId);
        this.informacion = informacion;
    }

    public void  modificarInformacion(Informacion informacion){
        this.informacion = Objects.requireNonNull(informacion);
    }

    public Informacion getInformacion() {
        return informacion;
    }
}
