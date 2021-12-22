package co.com.sofka.gerenteRedesSociales.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gerenteRedesSociales.values.Email;
import co.com.sofka.gerenteRedesSociales.values.IdCliente;

public class ModificadoEmailCliente extends DomainEvent {
    private IdCliente idCliente;
    private Email email;

    public ModificadoEmailCliente(IdCliente idCliente, Email email) {
        super("sofka.gerenteredessociales.gerenteredessocialescreado");
        this.idCliente = idCliente;
        this.email = email;
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }

    public Email getEmail() {
        return email;
    }
}
