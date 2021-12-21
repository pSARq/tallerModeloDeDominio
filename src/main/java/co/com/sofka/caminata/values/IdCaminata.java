package co.com.sofka.caminata.values;

import co.com.sofka.domain.generic.Identity;

public class IdCaminata extends Identity {

    public IdCaminata(){

    }

    public IdCaminata(String id){
        super(id);
    }

    public IdCaminata of(String id){
        return new IdCaminata(id);
    }
}
