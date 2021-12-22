package co.com.sofka.gerenteRedesSociales.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.gerenteRedesSociales.values.IdCliente;
import co.com.sofka.gerenteRedesSociales.values.IdGerenteRedesSociales;
import co.com.sofka.gerenteRedesSociales.values.NumeroCelular;

public class ModificarNumeroCelularCliente extends Command {

    private IdGerenteRedesSociales idGerenteRedesSociales;
    private IdCliente idCliente;
    private NumeroCelular numeroCelular;

    public ModificarNumeroCelularCliente(IdGerenteRedesSociales idGerenteRedesSociales, IdCliente idCliente, NumeroCelular numeroCelular){
        this.idGerenteRedesSociales = idGerenteRedesSociales;
        this.idCliente = idCliente;
        this.numeroCelular = numeroCelular;
    }

    public IdGerenteRedesSociales getIdGerenteRedesSociales() {
        return idGerenteRedesSociales;
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
