package co.com.sofka.caminata.events;

import co.com.sofka.domain.generic.DomainEvent;

public class HoraLlegadaModificada extends DomainEvent {

    private final int horaLlegada;
    public HoraLlegadaModificada(int horaLlegada) {
        super("sofka.caminata.horallegadamodificada");
        this.horaLlegada = horaLlegada;
    }

    public int getHoraLlegada() {
        return horaLlegada;
    }
}
