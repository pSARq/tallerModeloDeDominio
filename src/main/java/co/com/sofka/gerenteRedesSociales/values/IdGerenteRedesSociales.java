package co.com.sofka.gerenteRedesSociales.values;

import co.com.sofka.domain.generic.Identity;

public class IdGerenteRedesSociales extends Identity {

    public IdGerenteRedesSociales(){

    }

    public IdGerenteRedesSociales(String id){
        super(id);
    }

    public IdGerenteRedesSociales of(String id){
        return new IdGerenteRedesSociales(id);
    }
}
