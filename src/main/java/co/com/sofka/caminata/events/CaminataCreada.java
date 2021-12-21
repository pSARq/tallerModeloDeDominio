package co.com.sofka.caminata.events;

import co.com.sofka.caminata.values.IdRuta;
import co.com.sofka.caminata.values.Refrigerio;
import co.com.sofka.caminata.values.RegaloSorpresa;
import co.com.sofka.domain.generic.DomainEvent;

public class CaminataCreada extends DomainEvent {
    private final Refrigerio refrigerio;
    private final RegaloSorpresa regaloSorpresa;
    private IdRuta idRuta;
    private final int horaLlegada;
    private final String puntoEncuentro;


    public CaminataCreada(Refrigerio refrigerio, RegaloSorpresa regaloSorpresa, IdRuta idRuta, int horaLlegada, String puntoEncuentro) {
        super("sofka.caminata.caminatacreada");
        this.refrigerio = refrigerio;
        this.regaloSorpresa = regaloSorpresa;
        this.idRuta = idRuta;
        this.horaLlegada = horaLlegada;
        this.puntoEncuentro = puntoEncuentro;
    }

    public Refrigerio getRefrigerio() {
        return refrigerio;
    }

    public RegaloSorpresa getRegaloSorpresa() {
        return regaloSorpresa;
    }

    public IdRuta getIdRuta() {
        return idRuta;
    }

    public int getHoraLlegada() {
        return horaLlegada;
    }

    public String getPuntoEncuentro() {
        return puntoEncuentro;
    }
}
