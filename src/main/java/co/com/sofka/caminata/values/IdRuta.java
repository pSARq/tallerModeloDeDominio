package co.com.sofka.caminata.values;

import co.com.sofka.domain.generic.Identity;

public class IdRuta extends Identity {

    public IdRuta(){

    }

    public IdRuta(String id){
        super(id);
    }

    public IdRuta of(String id){
        return new IdRuta(id);
    }
}
