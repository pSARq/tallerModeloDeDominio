package co.com.sofka.gerenteRedesSociales;

import co.com.sofka.administracion.Administracion;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.AggregateRoot;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gerenteRedesSociales.values.IdGerenteRedesSociales;

import java.util.List;
import java.util.Set;

public class GerenteRedesSociales extends AggregateEvent<IdGerenteRedesSociales> {

    protected String nombre;
    protected Set<Cliente> clientes;
    protected Set<Formulario> formularios;

    public GerenteRedesSociales(IdGerenteRedesSociales entityId, String nombre){
        super(entityId);
        appendChange(new GerenteRedesSocialesCreado(nombre));
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

    public void registrarInformacionFormulario(){

    }

    public void modificarInformacionFormulario(){

    }

    public void consultarInformacionFormulario(){

    }

    public void modificarEmailCliente(){

    }

    public void modificarNoCelularCliente(){

    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setFormularios(Set<Formulario> formularios) {
        this.formularios = formularios;
    }
}
