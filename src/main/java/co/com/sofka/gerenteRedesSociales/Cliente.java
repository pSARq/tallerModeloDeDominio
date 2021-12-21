package co.com.sofka.gerenteRedesSociales;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.gerenteRedesSociales.values.*;

import java.util.Objects;

public class Cliente extends Entity<IdCliente> {

    private String nombreCompleto;
    private Email email;
    private NumeroCelular numeroCelular;
    private Identificacion identificacion;

    public Cliente(IdCliente entityId, String nombreCompleto, Email email, NumeroCelular numeroCelular, Identificacion identificacion) {
        super(entityId);
        this.nombreCompleto = validarNombreCompleto(nombreCompleto);
        this.email = email;
        this.numeroCelular = numeroCelular;
        this.identificacion = identificacion;
    }

    private String validarNombreCompleto(String nombreCompleto){
        if (nombreCompleto.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        return nombreCompleto;
    }

    public void modificarEmail(Email email){
        this.email = Objects.requireNonNull(email);
    }

    public void modificarNumeroCelular(){
        this.numeroCelular = Objects.requireNonNull(numeroCelular);
    }

    private void RegistrarInformacionFormulario(){
        Informacion informacion = new Informacion(this.nombreCompleto, this.email, this.numeroCelular, this.identificacion);
        new Formulario(new IdFormulario(), informacion);
    }

}
