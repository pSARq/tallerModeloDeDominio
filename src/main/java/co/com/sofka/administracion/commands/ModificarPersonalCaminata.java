package co.com.sofka.administracion.commands;

import co.com.sofka.administracion.values.IdAdministracion;
import co.com.sofka.administracion.values.PersonalCaminata;
import co.com.sofka.domain.generic.Command;

public class ModificarPersonalCaminata extends Command {
    private final IdAdministracion idAdministracion;
    private final PersonalCaminata personalCaminata;

    public ModificarPersonalCaminata(IdAdministracion idAdministracion, PersonalCaminata personalCaminata) {
        this.idAdministracion = idAdministracion;
        this.personalCaminata = personalCaminata;
    }

    public IdAdministracion getIdAdministracion() {
        return idAdministracion;
    }

    public PersonalCaminata getPersonalCaminata() {
        return personalCaminata;
    }
}
