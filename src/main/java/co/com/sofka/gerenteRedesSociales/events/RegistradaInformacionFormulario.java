package co.com.sofka.gerenteRedesSociales.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gerenteRedesSociales.values.Email;
import co.com.sofka.gerenteRedesSociales.values.Identificacion;
import co.com.sofka.gerenteRedesSociales.values.NumeroCelular;

public class RegistradaInformacionFormulario extends DomainEvent {

    private String nombreCompleto;
    private Email email;
    private NumeroCelular numeroCelular;
    private Identificacion identificacion;

    public RegistradaInformacionFormulario(String nombreCompleto, Email email, NumeroCelular numeroCelular, Identificacion identificacion) {
        super("sofka.gerenteredessociales.gerenteredessocialescreado");
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.numeroCelular = numeroCelular;
        this.identificacion = identificacion;
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
