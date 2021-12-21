package co.com.sofka.caminata.events;

import co.com.sofka.domain.generic.DomainEvent;

public class CapacidadCargaDeRutaModificada extends DomainEvent {

    private final int capacidadCarga;

    public CapacidadCargaDeRutaModificada(int capacidadCarga) {
        super("sofka.caminata.capacidadrutamodificada");
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }
}