package co.com.sofka.caminata.events;

import co.com.sofka.caminata.values.RegaloSorpresa;
import co.com.sofka.domain.generic.DomainEvent;

public class RegaloSorpresaModificado extends DomainEvent {

    private final RegaloSorpresa regaloSorpresa;
    public RegaloSorpresaModificado(RegaloSorpresa regaloSorpresa) {
        super("sofka.caminata.regalosorpresamodificado");
        this.regaloSorpresa = regaloSorpresa;
    }

    public RegaloSorpresa getRegaloSorpresa() {
        return regaloSorpresa;
    }
}
