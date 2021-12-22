package co.com.sofka.gerenteRedesSociales;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gerenteRedesSociales.events.*;
import co.com.sofka.gerenteRedesSociales.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class GerenteRedesSociales extends AggregateEvent<IdGerenteRedesSociales> {

    protected String nombre;
    protected Set<Cliente> clientes;
    protected Set<Formulario> formularios;

    public GerenteRedesSociales(IdGerenteRedesSociales entityId, String nombre){
        super(entityId);
        appendChange(new GerenteRedesSocialesCreado(nombre)).apply();
    }

    private GerenteRedesSociales(IdGerenteRedesSociales entityId){
        super(entityId);
        subscribe(new GerenteRedesSocialesChange(this));
    }

    public static GerenteRedesSociales from(IdGerenteRedesSociales idGerenteRedesSociales, List<DomainEvent> events){
        GerenteRedesSociales gerenteRedesSociales = new GerenteRedesSociales(idGerenteRedesSociales);
        events.forEach(gerenteRedesSociales::applyEvent);
        return gerenteRedesSociales;
    }

    public void registrarInformacionFormulario(Cliente cliente){
        Objects.requireNonNull(cliente);
        appendChange(new RegistradaInformacionFormulario(cliente)).apply();
    }

    public void modificarInformacionFormulario(IdFormulario idFormulario, Informacion informacion){
        Objects.requireNonNull(idFormulario);
        Objects.requireNonNull(informacion);
        appendChange(new ModificadaInformacionFormulario(idFormulario, informacion)).apply();
    }

    public void modificarEmailCliente(IdCliente idCliente, Email email){
        Objects.requireNonNull(idCliente);
        Objects.requireNonNull(email);
        appendChange(new ModificadoEmailCliente(idCliente, email)).apply();
    }

    public void modificarNumeroCelularCliente(IdCliente idCliente, NumeroCelular numeroCelular){
        Objects.requireNonNull(idCliente);
        Objects.requireNonNull(numeroCelular);
        appendChange(new ModificadoNumeroCelularCliente(idCliente, numeroCelular)).apply();;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setFormularios(Set<Formulario> formularios) {
        this.formularios = formularios;
    }
}
