package co.com.sofka.gerenteRedesSociales;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gerenteRedesSociales.events.*;
import co.com.sofka.gerenteRedesSociales.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
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

    public void registrarInformacionFormulario(String nombreCompleto, Email email, NumeroCelular numeroCelular, Identificacion identificacion){
        Objects.requireNonNull(nombreCompleto);
        Objects.requireNonNull(email);
        Objects.requireNonNull(numeroCelular);
        Objects.requireNonNull(identificacion);
        appendChange(new RegistradaInformacionFormulario(nombreCompleto, email, numeroCelular, identificacion)).apply();
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

    protected Optional<Cliente> getClientePorId(IdCliente idCliente){
        return clientes().stream()
                .filter(cliente -> cliente.identity().equals(idCliente)).findFirst();
    }

    protected Optional<Formulario> getFormularioPorId(IdFormulario idFormulario){
        return formularios().stream()
                .filter(formulario -> formulario.identity().equals(idFormulario)).findFirst();
    }

    public String nombre() {
        return nombre;
    }

    public Set<Cliente> clientes() {
        return clientes;
    }

    public Set<Formulario> formularios() {
        return formularios;
    }
}
