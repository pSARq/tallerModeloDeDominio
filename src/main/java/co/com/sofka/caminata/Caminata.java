package co.com.sofka.caminata;

import co.com.sofka.caminata.events.*;
import co.com.sofka.caminata.values.IdCaminata;
import co.com.sofka.caminata.values.IdRuta;
import co.com.sofka.caminata.values.Refrigerio;
import co.com.sofka.caminata.values.RegaloSorpresa;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;

public class Caminata extends AggregateEvent<IdCaminata> {

    protected Refrigerio refrigerio;
    protected RegaloSorpresa regaloSorpresa;
    protected Ruta ruta;
    protected int horaLlegada;
    protected String puntoEncuentro;

    public Caminata(IdCaminata entityId, Refrigerio refrigerio, RegaloSorpresa regaloSorpresa, Ruta ruta, int horaLlegada, String puntoEncuentro){
        super(entityId);
        appendChange(new CaminataCreada(refrigerio, regaloSorpresa, ruta, horaLlegada, puntoEncuentro)).apply();
    }

    private Caminata(IdCaminata entityId){
        super(entityId);
        subscribe(new CaminataChange(this));
    }

    public static Caminata from(IdCaminata idCaminata, List<DomainEvent> events){
        Caminata caminata = new Caminata(idCaminata);
        events.forEach(caminata::applyEvent);
        return caminata;
    }

    public void modificarRefrigerio(Refrigerio refrigerio){
        Objects.requireNonNull(refrigerio);
        appendChange(new RefrigerioModificado(refrigerio)).apply();
    }

    public void modificarRegaloSorpresa(RegaloSorpresa regaloSorpresa){
        Objects.requireNonNull(regaloSorpresa);
        appendChange(new RegaloSorpresaModificado(regaloSorpresa)).apply();
    }

    public void modificarHoraLlegada(int horaLlegada){
        Objects.requireNonNull(horaLlegada);
        appendChange(new HoraLlegadaModificada(horaLlegada)).apply();
    }

    public void modificarPuntoEncuentro(String puntoEncuentro){
        Objects.requireNonNull(puntoEncuentro);
        appendChange(new PuntoEncuentroModificado(puntoEncuentro)).apply();
    }

    public void modificarDuracionRuta(int duracionRuta){
        Objects.requireNonNull(duracionRuta);
        appendChange(new DuracionRutaModificada(duracionRuta)).apply();
    }

    public void modificarDistanciaRuta(int distanciaTotal){
        Objects.requireNonNull(distanciaTotal);
        appendChange(new DistanciaRutaModificada(distanciaTotal)).apply();
    }

    public void modificarCapacidadCargaDeRuta(int capacidadCarga){
        Objects.requireNonNull(capacidadCarga);
        appendChange(new CapacidadCargaDeRutaModificada(capacidadCarga)).apply();
    }

    public void modificarDificultadRuta(String dificultad){
        Objects.requireNonNull(dificultad);
        appendChange(new DificultadRutaModificada(dificultad));
    }

    public Refrigerio refrigerio() {
        return refrigerio;
    }

    public RegaloSorpresa regaloSorpresa() {
        return regaloSorpresa;
    }

    public Ruta ruta() {
        return ruta;
    }

    public int horaLlegada() {
        return horaLlegada;
    }

    public String puntoEncuentro() {
        return puntoEncuentro;
    }
}
