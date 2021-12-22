package co.com.sofka.gerenteRedesSociales.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gerenteRedesSociales.Cliente;

public class RegistradaInformacionFormulario extends DomainEvent {
    private Cliente cliente;

    public RegistradaInformacionFormulario(Cliente cliente) {
        super("sofka.gerenteredessociales.gerenteredessocialescreado");
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

}
