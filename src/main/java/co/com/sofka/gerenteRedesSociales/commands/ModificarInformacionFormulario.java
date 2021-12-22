package co.com.sofka.gerenteRedesSociales.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.gerenteRedesSociales.values.IdFormulario;
import co.com.sofka.gerenteRedesSociales.values.IdGerenteRedesSociales;
import co.com.sofka.gerenteRedesSociales.values.Informacion;

public class ModificarInformacionFormulario extends Command {

    private IdGerenteRedesSociales idGerenteRedesSociales;
    private IdFormulario idFormulario;
    private Informacion informacion;

    public ModificarInformacionFormulario(IdGerenteRedesSociales idGerenteRedesSociales, IdFormulario idFormulario, Informacion informacion){
        this.idGerenteRedesSociales = idGerenteRedesSociales;
        this.idFormulario = idFormulario;
        this.informacion = informacion;
    }

    public IdGerenteRedesSociales getIdGerenteRedesSociales() {
        return idGerenteRedesSociales;
    }

    public IdFormulario getIdFormulario() {
        return idFormulario;
    }

    public Informacion getInformacion() {
        return informacion;
    }
}

