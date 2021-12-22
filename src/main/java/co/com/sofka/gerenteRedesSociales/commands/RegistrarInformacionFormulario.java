package co.com.sofka.gerenteRedesSociales.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.gerenteRedesSociales.values.Email;
import co.com.sofka.gerenteRedesSociales.values.IdGerenteRedesSociales;
import co.com.sofka.gerenteRedesSociales.values.Identificacion;
import co.com.sofka.gerenteRedesSociales.values.NumeroCelular;

public class RegistrarInformacionFormulario extends Command {

    private IdGerenteRedesSociales idGerenteRedesSociales;
    private String nombreCompleto;
    private Email email;
    private NumeroCelular numeroCelular;
    private Identificacion identificacion;

    public RegistrarInformacionFormulario(IdGerenteRedesSociales idGerenteRedesSociales, String nombreCompleto, Email email, NumeroCelular numeroCelular, Identificacion identificacion){
        this.idGerenteRedesSociales = idGerenteRedesSociales;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.numeroCelular = numeroCelular;
        this.identificacion = identificacion;
    }

    public IdGerenteRedesSociales getIdGerenteRedesSociales() {
        return idGerenteRedesSociales;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public Email getEmail() {
        return email;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }
}
