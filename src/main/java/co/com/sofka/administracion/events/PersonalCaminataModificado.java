package co.com.sofka.administracion.events;

import co.com.sofka.administracion.values.PersonalCaminata;
import co.com.sofka.domain.generic.DomainEvent;

public class PersonalCaminataModificado extends DomainEvent {

    private final PersonalCaminata personalCaminata;

    public PersonalCaminataModificado(PersonalCaminata personalCaminata) {
        super("sofka.administracion.personalcaminatamodificado");
        this.personalCaminata = personalCaminata;
    }

    public PersonalCaminata getPersonalCaminata() {
        return personalCaminata;
    }
}
