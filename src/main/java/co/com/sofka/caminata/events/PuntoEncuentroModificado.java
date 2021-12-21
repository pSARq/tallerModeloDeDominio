package co.com.sofka.caminata.events;

import co.com.sofka.domain.generic.DomainEvent;

public class PuntoEncuentroModificado extends DomainEvent {

    private final String puntoEncuentro;

    public PuntoEncuentroModificado(String puntoEncuentro) {
        super("sofka.caminata.puntoencuentromodificado");
        this.puntoEncuentro = puntoEncuentro;
    }

    public String getPuntoEncuentro() {
        return puntoEncuentro;
    }
}
