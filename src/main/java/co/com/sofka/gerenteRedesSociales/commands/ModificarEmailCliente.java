package co.com.sofka.gerenteRedesSociales.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.gerenteRedesSociales.values.Email;
import co.com.sofka.gerenteRedesSociales.values.IdCliente;
import co.com.sofka.gerenteRedesSociales.values.IdGerenteRedesSociales;

public class ModificarEmailCliente extends Command {

    private IdGerenteRedesSociales idGerenteRedesSociales;
    private IdCliente idCliente;
    private Email email;

    public ModificarEmailCliente(IdGerenteRedesSociales idGerenteRedesSociales, IdCliente idCliente, Email email){
        this.idGerenteRedesSociales = idGerenteRedesSociales;
        this.idCliente = idCliente;
        this.email = email;
    }

    public IdGerenteRedesSociales getIdGerenteRedesSociales() {
        return idGerenteRedesSociales;
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }

    public Email getEmail() {
        return email;
    }
}
