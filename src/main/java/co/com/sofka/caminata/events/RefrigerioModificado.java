package co.com.sofka.caminata.events;

import co.com.sofka.caminata.values.Refrigerio;
import co.com.sofka.domain.generic.DomainEvent;

public class RefrigerioModificado extends DomainEvent {

    private final Refrigerio refrigerio;

    public RefrigerioModificado(Refrigerio refrigerio) {
        super("sofka.caminata.refrigeriomodificado");
        this.refrigerio = refrigerio;
    }

    public Refrigerio getRefrigerio() {
        return refrigerio;
    }
}
