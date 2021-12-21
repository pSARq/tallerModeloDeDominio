package co.com.sofka.administracion.values;

import co.com.sofka.domain.generic.Identity;

public class IdGuia extends Identity {

    public IdGuia(){

    }

    public IdGuia(String id){
        super(id);
    }

    public IdGuia of(String id){
        return new IdGuia(id);
    }
}
