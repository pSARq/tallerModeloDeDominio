package co.com.sofka.administracion.values;

import co.com.sofka.domain.generic.Identity;

public class IdAdministracion extends Identity {

    public IdAdministracion(){

    }

    private IdAdministracion(String id){
        super(id);
    }

    public static IdAdministracion of(String id){
        return new IdAdministracion(id);
    }
}
