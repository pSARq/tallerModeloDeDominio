package co.com.sofka.administracion.values;

import co.com.sofka.domain.generic.Identity;

public class IdActividadRecreativa extends Identity {

    public IdActividadRecreativa(){

    }

    private IdActividadRecreativa(String id){
        super(id);
    }

    private IdActividadRecreativa of(String id){
        return new IdActividadRecreativa(id);
    }
}
