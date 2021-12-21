package co.com.sofka.caminata.events;

import co.com.sofka.domain.generic.DomainEvent;

public class DuracionRutaModificada extends DomainEvent {

    private final int duracionRuta;

    public DuracionRutaModificada(int duracionRuta) {
        super("sofka.caminata.duracionrutamodificada");
        this.duracionRuta = duracionRuta;
    }

    public int getDuracionRuta() {
        return duracionRuta;
    }
}
