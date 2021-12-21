package co.com.sofka.administracion;

import co.com.sofka.administracion.events.*;
import co.com.sofka.administracion.values.*;
import co.com.sofka.caminata.values.IdCaminata;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gerenteRedesSociales.values.IdCliente;
import co.com.sofka.gerenteRedesSociales.values.IdGerenteRedesSociales;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;


public class Administracion extends AggregateEvent<IdAdministracion> {

    protected IdCaminata idcaminata;
    protected IdGerenteRedesSociales idGerenteRedesSociales;
    protected String nombre;
    protected Set<Guia> guias;
    protected ActividadRecreativa actividadRecreativa;
    protected PersonalCaminata personalCaminata;

    public Administracion(IdAdministracion entityId, String nombre, IdGerenteRedesSociales idGerenteRedesSociales) {
        super(entityId);
        appendChange(new AdministracionCreada(nombre, idGerenteRedesSociales)).apply();
    }

    private Administracion(IdAdministracion entityId){
        super(entityId);
        subscribe(new AdministracionChange(this));
    }

    public static Administracion from(IdAdministracion idAdministracion, List<DomainEvent> events){
        var administracion = new Administracion(idAdministracion);
        events.forEach(administracion::applyEvent);
        return administracion;
    }

    public void seleccionarGuias(IdGuia idGuia, String nombre, int capacidadClientes){
        Objects.requireNonNull(idGuia);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(capacidadClientes);
        appendChange(new GuiasSeleccionados(idGuia, nombre, capacidadClientes)).apply();
    }

    public void seleccionarActividadRecreativa(IdActividadRecreativa idActividadRecreativa, String nombre, Material material, Actividad actividad){
        Objects.requireNonNull(idActividadRecreativa);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(material);
        Objects.requireNonNull(actividad);
        appendChange(new ActividadRecreativaSeleccionada(idActividadRecreativa, nombre, material, actividad)).apply();
    }

    public void modificarCapacidadClientesGuia(IdGuia idGuia, int capacidadClientes){
        Objects.requireNonNull(idGuia);
        Objects.requireNonNull(capacidadClientes);
        appendChange(new ModificadaCapacidadClientesDelGuia(idGuia, capacidadClientes)).apply();
    }

    public void asignarPersonalCaminata(IdCaminata idCaminata, Set<Guia> guias, ActividadRecreativa actividadRecreativa){
        Objects.requireNonNull(idCaminata);
        Objects.requireNonNull(guias);
        Objects.requireNonNull(actividadRecreativa);
        IdCliente idCliente =  this.idGerenteRedesSociales.idCliente();
        appendChange(new AsignadoPersonalCaminata(idCaminata, idCliente, guias, actividadRecreativa));
    }

    public void asignarBinocularesGuia(IdGuia idGuia, Binoculares binoculares){
        Objects.requireNonNull(idGuia);
        Objects.requireNonNull(binoculares);
        appendChange(new AsignadoBinocularAGuia(idGuia, binoculares)).apply();
    }

    public void modificarBinocularesGuia(IdGuia idGuia, Binoculares binoculares){
        Objects.requireNonNull(idGuia);
        appendChange(new ModificadoAsignacionBinocularesGuia(idGuia, binoculares)).apply();
    }

    public void modificarNombreActividadRecreativa( String nombre){
        Objects.requireNonNull(nombre);
        appendChange(new ModificadoNombreActividadRecreativa(nombre)).apply();
    }

    public void modificarMaterialDeActividadRecreativa(Material material){
        Objects.requireNonNull(material);
        appendChange(new ModificadoMaterialActividadRecreativa(material)).apply();
    }

    public void modificarActividadDeActividadRecreativa(Actividad actividad){
        Objects.requireNonNull(actividad);
        appendChange(new ModificadaActividadDeActividadRecreativa(actividad)).apply();
    }

    public void modificarPersonalCaminata(PersonalCaminata personalCaminata){
        Objects.requireNonNull(personalCaminata);
        appendChange(new PersonalCaminataModificado(personalCaminata)).apply();
    }

    protected Optional<Guia> getGuiaPorId(IdGuia idGuia){
        return guias().stream()
                .filter(guia -> guia.identity().equals(idGuia)).findFirst();
    }

    public IdCaminata idcaminata() {
        return idcaminata;
    }

    public String nombre() {
        return nombre;
    }

    public Set<Guia> guias() {
        return guias;
    }

    public ActividadRecreativa actividadRecreativa() {
        return actividadRecreativa;
    }

    public PersonalCaminata personalCaminata() {
        return personalCaminata;
    }
}
