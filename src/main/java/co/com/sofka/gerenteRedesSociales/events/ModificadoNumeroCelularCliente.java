package co.com.sofka.gerenteRedesSociales.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gerenteRedesSociales.values.IdCliente;
import co.com.sofka.gerenteRedesSociales.values.NumeroCelular;

public class ModificadoNumeroCelularCliente extends DomainEvent {
    private IdCliente idCliente;
    private NumeroCelular numeroCelular;

    public ModificadoNumeroCelularCliente(IdCliente idCliente, NumeroCelular numeroCelular) {
        super("sofka.gerenteredessociales.gerenteredessocialescreado");
        this.idCliente = idCliente;
        this.numeroCelular = numeroCelular;
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
