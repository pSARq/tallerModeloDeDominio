package co.com.sofka.caminata.events;

import co.com.sofka.domain.generic.DomainEvent;

public class DificultadRutaModificada extends DomainEvent {

    private final String dificultad;

    public DificultadRutaModificada(String dificultad) {
        super("sofka.caminata.dificultadrutamodificada");
        this.dificultad = dificultad;
    }

    public String getDificultad() {
        return dificultad;
    }
}
