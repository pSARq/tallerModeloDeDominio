package co.com.sofka.caminata.events;

import co.com.sofka.domain.generic.DomainEvent;

public class DistanciaRutaModificada extends DomainEvent {

    private final int distanciaTotal;

    public DistanciaRutaModificada(int distanciaTotal) {
        super("sofka.caminata.distanciatotalmodificada");
        this.distanciaTotal = distanciaTotal;
    }

    public int getDistanciaTotal() {
        return distanciaTotal;
    }
}
