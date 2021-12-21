package co.com.sofka.caminata;

import co.com.sofka.caminata.events.CaminataCreada;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.EventChange;

public class CaminataChange extends EventChange {

    public CaminataChange(Caminata caminata) {

        apply((CaminataCreada event)->{

        });
    }
}
